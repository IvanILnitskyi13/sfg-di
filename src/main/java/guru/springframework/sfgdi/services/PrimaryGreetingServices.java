package guru.springframework.sfgdi.services;

public class PrimaryGreetingServices implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY bean";
    }
}

