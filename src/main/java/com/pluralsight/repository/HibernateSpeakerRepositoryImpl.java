package com.pluralsight.repository;

import com.pluralsight.mdoel.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {



    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();
        //we have to get the instance of the Data class manually
        Speaker speaker = new Speaker();
        speaker.setFirstName("Ernest");
        speaker.setLastName("Eferetin");
        speakers.add(speaker);
        return speakers;
    }
}
