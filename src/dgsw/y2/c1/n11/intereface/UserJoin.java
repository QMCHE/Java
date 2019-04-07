package dgsw.y2.c1.n11.intereface;

import java.util.List;

public class UserJoin {
	
	private UserManager userManager = new FileUserManager();
	
	public void join(String id, String name, String password, String phoneNumber) {
		User user = new User();
		
		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		user.setPhoneNumber(phoneNumber);
		
		userManager.join(user);
	}
	
	public User read(String id) {
		return userManager.read(id);
	}
	
	public void out(String id) {
		userManager.out(id);
	}
	
	public void list() {
		List<User> userList = userManager.list();
		System.out.println("SIZE : " + userList.size());
		for(User item : userList) {
			System.out.println(" " + item.getName());
		}
	}
	
	public static void main(String[] args) {
		UserJoin userJoin = new UserJoin();
		
		userJoin.list();
		
		/*
		userJoin.join("hello@dgsw.hs.kr", "ÀÌ¸§", "123456", "010-1234-5678");
		userJoin.join("abcd@dgsw.hs.kr", "½Å¹Î¼ö", "123456", "010-0000-0000");
		*/
		
		/*
		User user = userJoin.read("hello@dgsw.hs.kr");
		System.out.println(user.getId() + " " + user.getName());
		*/
		
		/*
		userJoin.out("hello@dgsw.hs.kr");
		*/
		
		/*
		User user1 = userJoin.read("abc@dgsw.hs.kr");
		System.out.println(user1.getId() + " " + user1.getName());
		*/
	}
	
}
