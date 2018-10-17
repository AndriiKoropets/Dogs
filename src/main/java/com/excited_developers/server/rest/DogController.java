package com.excited_developers.server.rest;

import com.excited_developers.server.DogBootstrapServer;
import com.excited_developers.server.dao.dog.DogMapper;
import com.excited_developers.server.dto.Dog;
import com.excited_developers.server.service.DogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(DogBootstrapServer.REST_BASE_PATH + "/dogs")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@Slf4j
public class DogController {

  private final DogService dogService;
  private final DogMapper dogMapper;
  private Logger log = LoggerFactory.getLogger("analytics");

  @GetMapping
  public List<Dog> getDogs() {
    log.debug("Getting all dogs...");
    log.info("All dogs are showing:...");
    return dogMapper.toDto(dogService.getAll());
  }

  @PostMapping
  public Dog saveDog(@RequestBody Dog dog) {
    log.info("Saving such dog = {}", dog);
    return dogMapper.toDto(dogService.saveDog(dogMapper.toEntity(dog)));
  }
}
