package com.pluralsight.service;

import com.pluralsight.model.Speaker;

import java.util.List;

public interface ISpeakerService
{
    List<Speaker> findAll();
}
