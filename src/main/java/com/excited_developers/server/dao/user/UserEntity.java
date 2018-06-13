package com.excited_developers.server.dao.user;

import com.excited_developers.server.dao.dog.DogEntity;
import com.excited_developers.server.dao.home.HomeEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "user")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = SEQUENCE)
  private Long id;
  private String name;
  private String email;
  @Column(name = "phone_number")
  private String phoneNumber;
  @OneToOne
  private HomeEntity home;
  @OneToMany(fetch = LAZY)
  private List<DogEntity> dogs;
}
