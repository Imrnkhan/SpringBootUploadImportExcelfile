package com.example.springbootuploadimportexcelfile.repository;

import com.example.springbootuploadimportexcelfile.Model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
}
