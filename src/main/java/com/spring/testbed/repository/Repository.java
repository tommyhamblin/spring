/*
 * Copyright 2020 Tommy Hamblin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * you may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.spring.testbed.repository;

import com.spring.testbed.model.DataObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Implementation of {@link IRepository}.
 *
 * @author tommy.hamblin.
 */
@org.springframework.stereotype.Repository("repository")
public class Repository implements IRepository
{
    /** Instance of {@link Calendar}. */
    @Autowired
    private Calendar cal;

    /** Use spring expression language to generate random seed num. */
    @Value("#{ T(java.lang.Math).random() * 100}")
    private double seedNum;

    /**
     * Default constructor.
     */
    public Repository()
    {
        super();
    }

    /**
     * {@inheritDoc}
     * @return List - the data objects.
     */
    @Override
    public List<DataObject> getAll()
    {
        final List<DataObject> dataObjects = new ArrayList<>();

        final DataObject dataObject = new DataObject();
        dataObject.setFirstVariable("Tommy"); //NON-NLS
        dataObject.setSecondVariable("Hamblin"); //NON-NLS
        dataObject.setSeedNum(this.seedNum);

        System.out.println("Cal: " + cal.getTime());

        dataObjects.add(dataObject);

        return dataObjects;
    }
}