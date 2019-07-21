package com.example.rakusushi.trial;

import com.example.rakusushi.trial.domain.model.Trial;
import com.example.rakusushi.trial.domain.model.TrialRepository;
import com.example.rakusushi.trial.domain.model.TrialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * トライアルコントローラー
 */
@RestController
public class TrialController {

  private final TrialRepository trialRepository;

  private final TrialService trialService;

  public TrialController(TrialRepository trialRepository,
                         TrialService trialService) {
    this.trialRepository = trialRepository;
    this.trialService = trialService;
  }

  @GetMapping("/trial")
  public Trial trial() {
    return trialService.convert(trialRepository.findById("demo"));
  }

}
