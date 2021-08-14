package guru.springframework.sfgdi.services;


public class SetterInjectedGreetingServices implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
