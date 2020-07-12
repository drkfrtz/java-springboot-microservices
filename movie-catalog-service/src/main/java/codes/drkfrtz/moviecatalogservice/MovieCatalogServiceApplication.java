package codes.drkfrtz.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.beans.BeanProperty;

@SpringBootApplication
public class MovieCatalogServiceApplication {

	@Bean
	public RestTemplate setupRestTemplate() { return new RestTemplate(); }

	@Bean
	public WebClient.Builder setupWebClientBuilder() { return WebClient.builder(); }

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
