package guru.springframework.sfgdi.services;


public class PropertyInjectedGreetingServices implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
