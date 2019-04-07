package dgsw.y2.c1.n11.intereface;

import java.util.List;

public interface UserManager {
	
	public void join(User user);
	
	public void update(User user);
	
	public User read(String id);
	
	public void out(String id);
	
	public List<User> list();
}
