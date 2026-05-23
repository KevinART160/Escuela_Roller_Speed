package com.prueba1.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba1.v1.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}