package com.excited_developers.server.dao.home;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "home")
public class HomeEntity {

  @Id
  @SequenceGenerator(name = "home_id_seq", sequenceName = "home_id_seq")
  @GeneratedValue(strategy = SEQUENCE, generator = "home_id_seq")
  private long id;
  private String city;
  private double latitude;
  private double longitude;
  @Column(name = "home_number")
  private int homeNumber;
  private String street;

}
