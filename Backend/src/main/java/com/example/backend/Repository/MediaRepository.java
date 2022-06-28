package com.example.backend.Repository;

import com.example.backend.Model.Media.Master.Media;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MediaRepository extends JpaRepository<Media, Integer> {
}
