package com.pluralsight.service;

import com.pluralsight.mdoel.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    //manually wiring the Service class to the Repository class
    private SpeakerRepository repository;

    //deffault constructor
    public SpeakerServiceImpl(){
        System.out.println("speakerServiceImpl no args constructor");
    }

    //adding a constructor
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("speakerServiceImpl repo constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    // this setter enables us to get the instance of SpeakerRepository for setter injection
    @Autowired  //it injects automatically the SpeakerRepository Bean into the setter in AppConfig class
    public void setRepository(SpeakerRepository repository) {
        System.out.println("speakerServiceImpl setter");
        this.repository = repository;
    }
}
