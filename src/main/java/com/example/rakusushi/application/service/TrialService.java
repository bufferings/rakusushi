package com.example.rakusushi.application.service;

import com.example.rakusushi.application.repository.TrialRepository;
import com.example.rakusushi.domain.model.Trial;
import org.springframework.stereotype.Service;

/**
 * とらいあるサービス
 */
@Service
public class TrialService {

  private final TrialRepository trialRepository;

  public TrialService(TrialRepository trialRepository) {
    this.trialRepository = trialRepository;
  }

  public Trial convert(String name) {
    Trial trial = trialRepository.findById(name);
    return new Trial(trial.getName() + "-a");
  }
}
