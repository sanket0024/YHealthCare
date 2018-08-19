/**
 * @author Sanket Mathur
 * @date 16 Aug 2018
 *
 * Company: YHC
 */

package yhcmain.healthcare.service.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yhcmain.healthcare.domainObjects.User;
import yhcmain.healthcare.repositories.UserRepository;


/**
 * Implementation of UserService
 */

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	UserServiceImpl(UserRepository userRepository){
		this.userRepository=userRepository;
	}

	public User createUser(User user) {
		return this.userRepository.save(user);
	}
}
