/**
 * @author Sanket Mathur
 * @date 11 Aug 2018
 *
 * Company: YHC
 */
package s2018.yhcmain.healthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This file will act as a medium between the frontend and backend code
 */

@ComponentScan(basePackages = "yhcmain.healthcare")
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HealthcareApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareApplication.class, args);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("OPTIONS","PUT", "DELETE","POST","GET","PATCH")
				.allowedHeaders("*")
				.allowedOrigins("*")
				.exposedHeaders("Access-Control-Allow-Origin:*");
	}
}
