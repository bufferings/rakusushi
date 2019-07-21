package com.example.rakusushi.trial.domain.model;

/**
 * とらいあるリポジトリー
 */
public interface TrialRepository {
  Trial findById(String name);
}
