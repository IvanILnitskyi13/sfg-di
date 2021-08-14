package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile({"ES"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishService(){
        return new I18nSpanishGreetingService();
    }

    @Profile({"EN", "default"})
    @Bean
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingServices primaryGreetingServices(){
        return new PrimaryGreetingServices();
    }

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
