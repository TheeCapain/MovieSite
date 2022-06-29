package com.example.backend.Service;

import com.example.backend.Model.Media.Master.Media;
import com.example.backend.Repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaService {

    @Autowired
    MediaRepository mediaRepository;

    public void saveMedia(Media media) {
        mediaRepository.save(media);
    }

    public Optional<Media> findMedia(int id) {
        return mediaRepository.findById(id);
    }

    public List<Media> findAllMedia(){
        return mediaRepository.findAll();
    }

    public void deleteMediaById(int id){
        mediaRepository.deleteById(id);
    }

}
