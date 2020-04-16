import com.pluralsight.mdoel.Speaker;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args){
        // manually get the instance of our service class
        SpeakerService  service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());


    }
}
