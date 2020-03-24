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
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link IRepository}.
 *
 * @author tommy.hamblin.
 */
public class Repository implements IRepository
{
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
        dataObjects.add(dataObject);

        return dataObjects;
    }
}