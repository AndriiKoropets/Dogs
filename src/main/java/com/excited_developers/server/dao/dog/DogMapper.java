package com.excited_developers.server.dao.dog;

import com.excited_developers.server.dao.common.Mapper;
import com.excited_developers.server.dao.owner.OwnerMapper;
import com.excited_developers.server.dto.Dog;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DogMapper extends Mapper<DogEntity, Dog> {

  private final OwnerMapper ownerMapper;

  @Override
  protected Dog asDto(DogEntity e) {
    return Dog.builder()
        .name(e.getName())
        .breed(e.getBreed())
        .owner(ownerMapper.toDto(e.getOwner()))
        .build();
  }

  @Override
  protected DogEntity asEntity(Dog dto) {
    return DogEntity.builder()
        .name(dto.getName())
        .breed(dto.getBreed())
        .owner(ownerMapper.toEntity(dto.getOwner()))
        .build();
  }
}
