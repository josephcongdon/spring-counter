package com.repositories;

import com.models.Counter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

       @Qualifier("counter")
       @Repository
       @EnableJpaRepositories
       public interface CounterRepository extends JpaRepository <Counter, Long>{
}
