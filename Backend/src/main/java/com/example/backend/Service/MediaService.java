package com.example.backend.Service;

import com.example.backend.Model.Master.Media;
import com.example.backend.Repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaService {

    @Autowired
    MediaRepository mediaRepository;

    public void saveMedia(Media media){
        mediaRepository.save(media);

    }
}
