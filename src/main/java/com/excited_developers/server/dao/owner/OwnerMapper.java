package com.excited_developers.server.dao.owner;

import com.excited_developers.server.dao.common.Mapper;
import com.excited_developers.server.dto.Owner;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OwnerMapper extends Mapper<OwnerEntity, Owner> {

  @Override
  protected Owner asDto(OwnerEntity e) {
    return Owner.builder()
        .name(e.getName())
        .email(e.getEmail())
        .phoneNumber(e.getPhoneNumber())
        .street(e.getStreet())
        .build();
  }

  @Override
  protected OwnerEntity asEntity(Owner dto) {
    return OwnerEntity.builder()
        .name(dto.getName())
        .email(dto.getEmail())
        .phoneNumber(dto.getPhoneNumber())
        .street(dto.getStreet())
        .build();
  }
}
