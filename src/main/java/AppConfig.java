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

import com.spring.testbed.repository.Repository;
import com.spring.testbed.repository.IRepository;
import com.spring.testbed.service.IService;
import com.spring.testbed.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The application configuration to wire up the Spring beans.
 *
 * @author tommy.hamblin.
 */
@Configuration
public class AppConfig
{
    /**
     * The bean for the service layer.
     *
     * @return IService - instance of {@link IService}.
     */
    @Bean(name = "service")
    public IService getService()
    {
        return new Service(this.getRepository());
    }

    /**
     * The bean for the repository layer.
     *
     * @return IRepository - instance of {@link IRepository}.
     */
    @Bean(name = "repository")
    public IRepository getRepository()
    {
        return new Repository();
    }
}