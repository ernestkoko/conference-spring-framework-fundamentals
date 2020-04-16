import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

//@Configuration signifies this class(AppConfig) is going to be used for configuration purpose
@Configuration
public class AppConfig {

    //setter injection is calling a setter method on a bean
    //NOTE: Bean is a singleton, meaning it returns same instance when called several times
    //if we do not use bean we get different instances when we call a method different times

    //@Bean tells the class the method below is a bean. We can optionally name our bean
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //dependency injection
        service.setRepository(getSpeakerRepository());
        return service;

    }
    @Bean(name = "speakerRepository")
    SpeakerRepository getSpeakerRepository(){

        return new HibernateSpeakerRepositoryImpl();
    }

}
