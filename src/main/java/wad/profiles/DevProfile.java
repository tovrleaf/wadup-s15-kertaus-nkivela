package wad.profiles;

import java.text.ParseException;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import wad.fixture.CoursesFixture;

@Configuration
@Profile(value = {"dev", "default"})
public class DevProfile {

}