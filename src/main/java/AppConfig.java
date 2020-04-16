import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;

//@Configuration signifies this class(AppConfig) is going to be used for configuration purpose
@Configuration
public class AppConfig {

    //setter injection is calling a setter method on a bean
    //NOTE: Bean is a singleton, meaning it returns same instance when called several times
    //if we do not use bean we get different instances when we call a method different times

    //@Bean tells the class the method below is a bean. We can optionally name our bean
    //@Scope restricts the instantiation of class to just one object
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON) //the default scope is singleton
    public SpeakerService getSpeakerService(){
        //Using constructor injection
       // SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //dependency injection
        //service.setRepository(getSpeakerRepository());
        return service;

    }
    @Bean(name = "speakerRepository")
    SpeakerRepository getSpeakerRepository(){

        return new HibernateSpeakerRepositoryImpl();
    }

}
