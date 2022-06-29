package com.example.backend.Controller;

import com.example.backend.Model.Media.Master.Media;
import com.example.backend.Service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("media")
public class MediaController {

    @Autowired
    MediaService mediaService;

    @PostMapping("/save")
    public void saveMedia(@RequestParam Media media) {
        mediaService.saveMedia(media);
    }

    @GetMapping("/{id}")
    public Optional<Media> findMediaById(@PathVariable int id) {
        System.out.println("Test");
        return mediaService.findMedia(id);
    }

    @GetMapping("/findAll")
    public List<Media> findAllMedia(){
        return mediaService.findAllMedia();
    }


    @DeleteMapping("/delete/{id}")
    public void deleteMedia(@PathVariable int id){
    mediaService.deleteMediaById(id);
    }
}
