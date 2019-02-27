package com.mikk.iti0208;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class NoteController {
    @Controller
    @RequestMapping
    public class MainController {
        @Autowired
        private NoteRepository noteRepository;
        @GetMapping(path="/add")
        public @ResponseBody String addNewNote (@RequestParam String note){
            Note n = new Note();
            n.setName(note);
            noteRepository.save(n);
            return "Saved";
        }
        @GetMapping(path="/all")
        public @ResponseBody Iterable<Note> getAllNotes() {
            return noteRepository.findAll();
        }
    }
}
