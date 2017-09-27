package zw.answered.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author amushate 27 Sep,2017
 */
@EnableWebMvc
@Configuration
@ComponentScan("zw.answered")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

}