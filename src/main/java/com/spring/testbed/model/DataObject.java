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

package com.spring.testbed.model;

/**
 * Generic data model object.
 *
 * @author tommy.hamblin.
 */
public class DataObject
{
    /** The first variable in the data object. */
    private String firstVariable;

    /** The second variable in the data object. */
    private String secondVariable;

    /**
     * Default constructor.
     */
    public DataObject()
    {
        super();
    }

    /**
     * Getter.
     *
     * @return firstVariable - the first variable in the data object.
     */
    public String getFirstVariable()
    {
        return this.firstVariable;
    }

    /**
     * Setter.
     *
     * @param firstVariable - the first variable to set.
     */
    public void setFirstVariable(final String firstVariable)
    {
        this.firstVariable = firstVariable;
    }

    /**
     * Getter.
     *
     * @return secondVariable - the second variable in the data object.
     */
    public String getSecondVariable()
    {
        return this.secondVariable;
    }

    /**
     * Setter.
     *
     * @param secondVariable - the second variable to set.
     */
    public void setSecondVariable(final String secondVariable)
    {
        this.secondVariable = secondVariable;
    }
}