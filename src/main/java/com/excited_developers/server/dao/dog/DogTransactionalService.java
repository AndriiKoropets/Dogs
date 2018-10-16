package com.excited_developers.server.dao.dog;

import com.excited_developers.server.service.DogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class DogTransactionalService implements DogService {

  private final DogRepository dogRepository;

  @Override
  public DogEntity saveDog(DogEntity dog) {
    return dogRepository.save(dog);
  }

  @Override
  public List<DogEntity> getAll() {
    return dogRepository.findAll();
  }
}
