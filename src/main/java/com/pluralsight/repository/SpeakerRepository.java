package com.pluralsight.repository;

import com.pluralsight.mdoel.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
