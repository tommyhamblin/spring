import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.ISpeakerRepository;
import com.pluralsight.service.ISpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name = "speakerService")
    public ISpeakerService getSpeakerService()
    {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        speakerService.setRepository(this.getSpeakerRepository());
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public ISpeakerRepository getSpeakerRepository()
    {
        return new HibernateSpeakerRepositoryImpl();
    }
}
