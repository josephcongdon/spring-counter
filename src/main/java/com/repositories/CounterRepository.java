package com.repositories;

import com.models.Counter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository <Counter, Long>{


}
