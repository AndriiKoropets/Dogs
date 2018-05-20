package com.excited_developers.server.dao.owner;

import com.excited_developers.server.dao.dog.DogEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "owner")
public class OwnerEntity {
  @Id
  @GeneratedValue(strategy = SEQUENCE)
  private Long id;
  private String name;
  private String email;
  @Column(name = "phone_number")
  private String phoneNumber;
  private String street;
  @Column(name = "home_number")
  private int homeNumber;
  @OneToMany(fetch = LAZY)
  private List<DogEntity> dogs;
}
