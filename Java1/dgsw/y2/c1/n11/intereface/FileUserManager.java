package dgsw.y2.c1.n11.intereface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

public class FileUserManager implements UserManager {
	
	private File file;

	public FileUserManager() {
		file = new File("user_list.txt");
	}

	private boolean isOverlab(Object o) {
		return o != null;
	}

	@Override
	public void join(User user) throws IdRepeatException {
		if(isOverlab(read(user.getId()))) { 	// 유저가 중복될 경우
			throw new IdRepeatException();
		}

		String line = String.format("%s,%s,%s,%s\n", user.getId(), user.getName(), user.getPassword(), user.getPhoneNumber());

		try {
			FileWriter writer = new FileWriter(this.file, true);
			writer.write(line);
			writer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(User user) {
		out(user.getId());
		join(user);
	}

	@Override
	public User read(String id) {
		List<User> list = list();

		for (User user : list) {
			if (user.getId().equals(id)) {
				return user;
			}
		}

		return null;
	}

	@Override
	public void out(String id) {
		List<User> list = list();

		file.delete();

		try {
			for (User user : list) {
				if (!user.getId().equals(id)) {
					join(user);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> list() {
		List<User> result = new LinkedList<User>();

		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);

			while(true) {
				String line = reader.readLine();	// 한 줄씩 읽어옴

				if(line == null) {
					break;
				}

				String[] tokens = line.split(",");

				User user = new User();

				user.setId(tokens[0]);
				user.setName(tokens[1]);
				user.setPassword(tokens[2]);
				user.setPhoneNumber(tokens[3]);

				result.add(user);
			}

			reader.close();

		} catch(Exception e) {

		}
		return null;
	}

}
