package com.pluralsight.service;

import com.pluralsight.mdoel.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    //manually wiring the Service class to the Repository class
    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    // this setter enables us to get the instance of SpeakerRepository for setter injection
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
