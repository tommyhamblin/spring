package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements ISpeakerRepository
{
    @Override
    public List<Speaker> findAll()
    {
        final List<Speaker> speakers = new ArrayList<>();

        final Speaker speaker = new Speaker();
        speaker.setFirstName("Tommy"); //NON-NLS
        speaker.setLastName("Hamblin"); //NON-NLS
        speakers.add(speaker);

        return speakers;
    }
}
