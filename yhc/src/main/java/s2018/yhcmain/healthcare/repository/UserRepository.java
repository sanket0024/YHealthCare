package s2018.yhcmain.healthcare.repository;

import s2018.yhcmain.healthcare.domainObjects.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, String> {

}