import com.pluralsight.service.ISpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
    public static void main(final String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ISpeakerService service = applicationContext.getBean("speakerService", ISpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
