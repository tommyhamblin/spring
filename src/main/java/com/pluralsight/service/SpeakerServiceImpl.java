package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.ISpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements ISpeakerService
{
    private ISpeakerRepository repository;

    public SpeakerServiceImpl()
    {
        super();
    }

    @Override
    public List<Speaker> findAll()
    {
        return repository.findAll();
    }

    public void setRepository(final ISpeakerRepository repository)
    {
        this.repository = repository;
    }
}
