package com.excited_developers.server.dao.dog;


import com.excited_developers.server.dao.owner.OwnerEntity;
import com.excited_developers.server.dao.tenant.TenantEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;

import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "dog")
public class DogEntity {
  @Id
  @GeneratedValue(strategy = SEQUENCE)
  private Long id;
  private String name;
  @ManyToOne
  private OwnerEntity owner;
//  @ManyToMany
//  private List<TenantEntity> previousTenants;
}
