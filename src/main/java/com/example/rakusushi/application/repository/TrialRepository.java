package com.example.rakusushi.application.repository;

import com.example.rakusushi.domain.model.Trial;

/**
 * とらいあるリポジトリー
 */
public interface TrialRepository {
  Trial findById(String name);
}
