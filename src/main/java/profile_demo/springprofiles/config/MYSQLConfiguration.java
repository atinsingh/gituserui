package profile_demo.springprofiles.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("prod")
public class MYSQLConfiguration {
    @Bean
    public DataSource dataSource(){
        return  DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/bankapp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC")
                .username("root")
                .password("")
                .build();
    }
}

