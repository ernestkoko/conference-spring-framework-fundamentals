import com.pluralsight.mdoel.Speaker;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        //telling the application touse our config file
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // manually get the instance of our service class
        //SpeakerService  service = new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);

        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstName());


    }
}
