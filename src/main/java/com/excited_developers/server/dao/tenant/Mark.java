package com.excited_developers.server.dao.tenant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Mark {
  EXCELLENT("Excellent", 5),
  GOOD("Good", 4);

  private String mark;
  private int index;


}
