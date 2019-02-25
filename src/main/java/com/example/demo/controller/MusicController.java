package com.example.demo.controller;

import com.example.demo.model.Music;
import com.example.demo.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicController {
    @Autowired
    private MusicRepository musicRepository;

    @GetMapping("/getall")
    public List<Music> getMusic(){
        return musicRepository.findAll();
    }
    @GetMapping("/getone")
    public Music findMusicById(@RequestParam long id){
        return musicRepository.findById(id).get();
    }

    @PostMapping("/createmusic")
    public Music createMusic(@RequestBody Music music){
        return musicRepository.save(music);

    }
    @DeleteMapping("/delete")
    public void deleteMusic(@RequestParam long id) {
        musicRepository.deleteById(id);
    }
    @PutMapping("/update")
    public void updateMusic(@RequestBody Music music, @RequestParam long id){
        Music music1 = musicRepository.findById(id).get();
        music1.setState(music);
        musicRepository.save(music1);
    }


    @GetMapping(value = "/index")
    public String index(Model model){
        model.addAttribute(2);

        return "index";
    }
//ss


}

