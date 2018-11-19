/**
 * @author Sanket Mathur
 * @date 16 Aug 2018
 *
 * Company: YHC
 */

package s2018.yhcmain.healthcare.service.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import s2018.yhcmain.healthcare.dao.user.UserDao;
import s2018.yhcmain.healthcare.domainObjects.User;


/**
 * Implementation of UserService
 */

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User createUser(User user) {
		return this.userDao.createUser(user);
	}
}
