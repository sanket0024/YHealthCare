/**
 * @author Sanket Mathur
 * @date 16 Aug 2018
 *
 * Company: YHC
 */

package yhcmain.healthcare.service.user;

import org.springframework.stereotype.Service;
import yhcmain.healthcare.domainObjects.User;

/**
 * interface for user services
 */

public interface UserService {

	User createUser(User user);
}
