package s2018.yhcmain.healthcare.dao.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import s2018.yhcmain.healthcare.domainObjects.User;
import s2018.yhcmain.healthcare.repository.UserRepository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser (User user) {
		userRepository.save(user);
		System.out.println("*****&&&&&&&&#####$$$$$$$$####^^@@@@@@@@&");
		return null;
	}
}
