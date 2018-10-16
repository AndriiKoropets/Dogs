package com.excited_developers.server.dao.tenant;

import com.excited_developers.server.dao.common.Mapper;
import com.excited_developers.server.dao.dog.DogMapper;
import com.excited_developers.server.dto.Tenant;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TenantMapper extends Mapper<TenantEntity, Tenant> {

  private final DogMapper dogMapper;

  @Override
  protected Tenant asDto(TenantEntity e) {
    return Tenant.builder()
        .name(e.getName())
        .surname(e.getSurname())
        .email(e.getEmail())
        .phoneNumber(e.getPhoneNumber())
        .street(e.getStreet())
        .currentTakenDog(dogMapper.toDto(e.getCurrentTakenDog()))
        .build();
  }

  @Override
  protected TenantEntity asEntity(Tenant dto) {
    return TenantEntity.builder()
        .name(dto.getName())
        .surname(dto.getSurname())
        .email(dto.getEmail())
        .phoneNumber(dto.getPhoneNumber())
        .street(dto.getStreet())
        .currentTakenDog(dogMapper.toEntity(dto.getCurrentTakenDog()))
        .build();
  }
}
