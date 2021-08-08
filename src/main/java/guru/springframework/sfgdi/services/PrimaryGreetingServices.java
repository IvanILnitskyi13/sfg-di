package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServices implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY bean";
    }
}

