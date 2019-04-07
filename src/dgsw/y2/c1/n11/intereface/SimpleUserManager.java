package dgsw.y2.c1.n11.intereface;

import java.util.LinkedList;
import java.util.List;

public class SimpleUserManager implements UserManager {

	private List<User> userList = new LinkedList<User>();
	
	@Override
	public void join(User user) {
		userList.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public User read(String id) {
		for(User item : userList) {
			if(item.getId().equals(id)) {
				return item;
			}
		}
		return null;
	}

	@Override
	public void out(String id) {
		User user = read(id);
		if(user != null) {
			this.userList.remove(user);
		}
	}

	@Override
	public List<User> list() {
		return userList;
	}
	
}
