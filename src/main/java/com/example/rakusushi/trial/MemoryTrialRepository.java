package com.example.rakusushi.trial;

import com.example.rakusushi.trial.domain.model.Trial;
import com.example.rakusushi.trial.domain.model.TrialRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryTrialRepository implements TrialRepository {
  @Override
  public Trial findById(String name) {
    return new Trial(name);
  }
}
