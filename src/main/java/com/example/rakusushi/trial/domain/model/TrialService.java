package com.example.rakusushi.trial.domain.model;

import org.springframework.stereotype.Service;

/**
 * とらいあるサービス
 */
@Service
public class TrialService {

  public Trial convert(Trial trial) {
    return new Trial(trial.getName() + "-a");
  }
}
