package com.example.rakusushi.infrastructure;

import com.example.rakusushi.domain.model.Trial;
import com.example.rakusushi.application.repository.TrialRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryTrialRepository implements TrialRepository {
  @Override
  public Trial findById(String name) {
    return new Trial(name);
  }
}
