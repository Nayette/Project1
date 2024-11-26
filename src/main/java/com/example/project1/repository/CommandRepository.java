package com.example.project1.repository;

import com.example.project1.entity.CommandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepository extends JpaRepository<CommandEntity, Long> {
}
