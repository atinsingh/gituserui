package profile_demo.springprofiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommonConfig {
    @Bean
    RestTemplate template(){
        return new RestTemplate();
    }
}
