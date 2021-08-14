package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingServices;
import guru.springframework.sfgdi.services.SetterInjectedGreetingServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingServices propertyInjectedGreetingServices(){
        return new PropertyInjectedGreetingServices();
    }

    @Bean
    SetterInjectedGreetingServices setterInjectedGreetingServices(){
        return new SetterInjectedGreetingServices();
    }
}
