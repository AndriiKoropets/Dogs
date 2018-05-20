package com.excited_developers.server.dao.tenant;

import com.excited_developers.server.dao.dog.DogEntity;
import com.excited_developers.server.dao.owner.OwnerEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.MapKeyColumn;
import java.util.List;
import java.util.Map;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "tenant")
public class TenantEntity {
  @Id
  @GeneratedValue(strategy = SEQUENCE)
  private Long id;
  private String name;
  private String surname;
  private String email;
  @Column(name = "phone_number")
  private String phoneNumber;
  private String street;
  @Column(name = "home_number")
  private int homeNumber;
  @ManyToMany(fetch = LAZY)
  private List<DogEntity> takenDogs;
  @OneToOne
  private DogEntity currentTakenDog;
//  @MapKeyColumn
//  private Map<String, Integer> markKeys;
}
