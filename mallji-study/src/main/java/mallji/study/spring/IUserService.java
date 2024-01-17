package mallji.study.spring;

import java.util.List;

public interface IUserService {
	public List<User> findUserList();

	public void addUser();
}
