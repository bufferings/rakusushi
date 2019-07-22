package com.example.rakusushi.presentation.controller;

import com.example.rakusushi.domain.model.Trial;
import com.example.rakusushi.application.repository.TrialRepository;
import com.example.rakusushi.application.service.TrialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * トライアルコントローラー
 */
@RestController
public class TrialController {

  private final TrialService trialService;

  public TrialController(TrialService trialService) {
    this.trialService = trialService;
  }

  @GetMapping("/trial")
  public Trial trial() {
    return trialService.convert("demo");
  }

}
