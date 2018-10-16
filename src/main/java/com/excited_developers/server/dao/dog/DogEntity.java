package com.excited_developers.server.dao.dog;

import com.excited_developers.server.dao.owner.OwnerEntity;
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
  private String breed;
  @ManyToOne
  private OwnerEntity owner;
//  @ManyToMany
//  private List<TenantEntity> previousTenants;
}
