/**
 * @author Sanket Mathur
 * @date 16 Aug 2018
 *
 * Company: YHC
 */

package yhcmain.healthcare.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yhcmain.healthcare.domainObjects.User;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	@Transactional
	void deleteById(String s);
}
