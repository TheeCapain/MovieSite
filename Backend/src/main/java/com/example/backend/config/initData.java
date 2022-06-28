package com.example.backend.config;

import com.example.backend.Model.Media.Master.Media;
import com.example.backend.Model.Media.Movie;
import com.example.backend.Repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class initData implements CommandLineRunner {
    @Autowired
    MediaRepository mediaRepository;

    @Override
    public void run(String... args) throws Exception {
        Media media1 = new Movie();
        media1.setTitle("Hello");
        mediaRepository.save(media1);
    }
}
