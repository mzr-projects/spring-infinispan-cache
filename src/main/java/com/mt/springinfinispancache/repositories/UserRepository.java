package com.mt.springinfinispancache.repositories;

import com.mt.springinfinispancache.entities.UserDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDemo, Long> {
}
