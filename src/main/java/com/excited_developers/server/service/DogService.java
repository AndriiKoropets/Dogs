package com.excited_developers.server.service;

import com.excited_developers.server.dao.dog.DogEntity;

import java.util.List;

public interface DogService {
  DogEntity saveDog(DogEntity dog);
  List<DogEntity> getAll();
}
