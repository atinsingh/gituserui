package profile_demo.springprofiles.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

@Profile("dev")
@Configuration
public class H2Configuration {

    @Bean
    public DataSource dataSource(){
        return  DataSourceBuilder.create()
                .url("jdbc:h2:mem:testdb")
                .username("sa")
                .password("")
                .build();
    }


}
