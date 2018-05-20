package com.excited_developers.server.dao.common;

import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class Mapper<Entity, Dto> {

  public Dto toDto(Entity entity) {
    if (entity == null) {
      return null;
    }
    return asDto(entity);
  }

  public Entity toEntity(Dto dto) {
    if (dto == null) {
      return null;
    }
    return asEntity(dto);
  }

  protected abstract Dto asDto(Entity entity);
  protected abstract Entity asEntity(Dto dto);

  public List<Dto> toDto(List<Entity> entityList) {
    return toDto(entityList, entityList == null ? new ArrayList<>() : new ArrayList<>(entityList.size()));
  }

  public Set<Dto> toDto(Set<Entity> entitySet) {
    return toDto(entitySet, entitySet == null ? new HashSet<>() : new HashSet<>(entitySet.size()));
  }

  private <C extends Collection<Dto>> C toDto(Collection<Entity> entities, C result) {
    if (entities != null) {
      entities.forEach(e -> result.add(toDto(e)));
    }
    return result;
  }

  public List<Entity> toEntity(List<Dto> dtoList) {
    return toEntity(dtoList, dtoList == null ? new ArrayList<>() : new ArrayList<>(dtoList.size()));
  }

  public Set<Entity> toEntity(Set<Dto> dtoSet) {
    return toEntity(dtoSet, dtoSet == null ? new HashSet<>() : new HashSet<>(dtoSet.size()));
  }

  private <C extends Collection<Entity>> C toEntity(Collection<Dto> dtos, C result) {
    if (dtos != null) {
      dtos.forEach(d -> result.add(toEntity(d)));
    }
    return result;
  }
}