/**
 * @author Sanket Mathur
 * @date 11 Aug 2018
 *
 * Company: YHC
 */

package s2018.yhcmain.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import s2018.yhcmain.healthcare.domainObjects.User;
import s2018.yhcmain.healthcare.objects.ServiceResponse;
import s2018.yhcmain.healthcare.service.user.UserService;
import s2018.yhcmain.healthcare.utils.Constants;
import s2018.yhcmain.healthcare.utils.Utility;

/**
 * This file will act as a medium between the frontend and backend code
 */

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	private ServiceResponse response;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<ServiceResponse> signUpAttempt(@RequestBody User user) {
		System.out.println("\n\n***********In controller");
		try {
			user = userService.createUser(user);
			if(user == null) {
				Utility.setResponseObject(null, Constants.FAIL, "User creation failed", response);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Utility.setResponseObject(user, Constants.SUCCESS, "User created", response);
		System.out.println("\n\n*********** response: " + response);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/getRequest", method = RequestMethod.GET, headers = "Accept=application/json")
	public void signUpAttempt() {
		System.out.println("\n\n***********In controller");
	}
}
