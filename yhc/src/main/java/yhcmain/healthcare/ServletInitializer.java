/**
 * @author Sanket Mathur
 * @date 19 Aug 2018
 *
 * Company: YHC
 */

package yhcmain.healthcare;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HealthcareApplication.class);
	}

}