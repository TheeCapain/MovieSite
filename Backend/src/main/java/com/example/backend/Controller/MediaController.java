package com.example.backend.Controller;

import com.example.backend.Model.Master.Media;
import com.example.backend.Service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/media")
public class MediaController {

    @Autowired
    MediaService mediaService;


    @PostMapping("save")
    public void saveMedia(@RequestParam Media media){
        mediaService.saveMedia(media);
    }
}
