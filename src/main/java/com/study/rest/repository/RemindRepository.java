package com.study.rest.repository;

import com.study.rest.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by mr.balalykin on 11.10.2018.
 */
public interface RemindRepository extends JpaRepository<Remind, Long>{
}
