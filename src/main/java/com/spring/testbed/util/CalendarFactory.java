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

package com.spring.testbed.util;

import java.util.Calendar;
import org.springframework.beans.factory.FactoryBean;

/**
 * The factory bean for calendar objects.
 *
 * @author tommy.hamblin.
 */
public class CalendarFactory implements FactoryBean<Calendar>
{
    /** Instance of {@link Calendar}. */
    private Calendar instance = Calendar.getInstance();

    /**
     * Gets the calendar instance.
     * @return Calendar - instance of {@link Calendar}.
     * @throws Exception in case of creation errors.
     */
    @Override
    public Calendar getObject() throws Exception {
        return this.instance;
    }

    /**
     * Returns the type of class Calendar.
     *
     * @return Class - the type.
     */
    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    /**
     * Adds a specified number of days to the calendar.
     *
     * @param num - the number of days to add.
     */
    public void addDays(int num)
    {
        instance.add(Calendar.DAY_OF_YEAR, num);
    }
}