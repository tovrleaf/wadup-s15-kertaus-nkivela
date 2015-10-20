package wad;

import java.text.ParseException;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import wad.fixture.CoursesFixture;
import wad.profiles.DevProfile;
import wad.profiles.ProdProfile;

@EnableAsync
@EnableScheduling
@SpringBootApplication
@Import({DevProfile.class, ProdProfile.class})

public class Application {

    @Autowired
    private CoursesFixture coursesFixture;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @PostConstruct
    public void init() {
        // don't know if this is "right" place to do this but i'm
        // - running out of time
        // - agile ;)
        try {
            coursesFixture.populate();
        } catch (ParseException e) {
            // do nothing
        }
    }
}