package com.excited_developers.server.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class Tenant {

  private String name;
  private String surname;
  private String email;
  private String phoneNumber;
  private String street;
  private List<Dog> takenDogs;
  private Dog currentTakenDog;
}
