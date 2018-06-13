package com.excited_developers.server.dao.tenant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Mark {
  EXCELLENT("Excellent", 5),
  GOOD("Good", 4),
  COMME_CI_COMME_CA("Good", 3),
  BAD("Good", 2),
  VERY_BAD("Good", 1);

  private String mark;
  private int index;
}
