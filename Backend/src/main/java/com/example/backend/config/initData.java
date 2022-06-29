package com.example.backend.config;

import com.example.backend.Model.Media.Master.Media;
import com.example.backend.Model.Media.Movie;
import com.example.backend.Service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class initData implements CommandLineRunner {

    @Autowired
    MediaService mediaService;

    @Override
    public void run(String... args) throws Exception {
        Media media1 = new Movie();
        media1.setTitle("Hello");
        mediaService.saveMedia(media1);
        Media media2 = new Movie();
        media1.setTitle("Hello");
        mediaService.saveMedia(media2);
        Media media3 = new Movie();
        media1.setTitle("Hello");
        mediaService.saveMedia(media3);
    }
}
