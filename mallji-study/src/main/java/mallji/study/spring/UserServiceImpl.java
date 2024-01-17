package mallji.study.spring;

import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements IUserService{

	/**
	 * find user list.
	 *
	 * @return user list
	 */
	@Override
	public List<User> findUserList() {
		System.out.println("execute method： findUserList");
		return Collections.singletonList(new User("pdai", 18));
	}

	/**
	 * add user
	 */
	@Override
	public void addUser() {
		System.out.println("execute method： addUser");
		// do something
	}

}
