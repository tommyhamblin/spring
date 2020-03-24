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

import com.spring.testbed.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

/**
 * The application configuration to wire up the Spring beans.
 *
 * @author tommy.hamblin.
 */
@Configuration
@ComponentScan({"com.spring.testbed"})
public class AppConfig
{
    /**
     * The bean factory for the calendar objects.
     *
     * @return CalendarFactory - the bean factory.
     */
    @Bean(name = "cal")
    public CalendarFactory calFactory()
    {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    /**
     * Gets the calendar object from the bean factory.
     *
     * @return Calendar - the object representing a calendar.
     * @throws Exception in case of creation errors.
     */
    public Calendar cal() throws Exception
    {
        return calFactory().getObject();
    }

//    /**
//     * The bean for the service layer.
//     *
//     * @return IService - instance of {@link IService}.
//     */
//    @Bean(name = "service")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public IService getService()
//    {
////        final Service service = new Service(this.getRepository());
//        final Service service = new Service();
////        service.setRepository(this.getRepository());
//        return service;
//    }
//
//    /**
//     * The bean for the repository layer.
//     *
//     * @return IRepository - instance of {@link IRepository}.
//     */
//    @Bean(name = "repository")
//    public IRepository getRepository()
//    {
//        return new Repository();
//    }
}