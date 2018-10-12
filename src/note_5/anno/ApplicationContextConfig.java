package note_5.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 马昕 on 2018/10/12.
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public String message(){
        return "Hello world";
    }
}
