package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.UserDaoImpl;
import model.User;

public class LoginTest {

	//true
	@Test
	public void testLoginTrue() {
		UserDaoImpl instance = new UserDaoImpl();
		User user = new User("B17DCCN496","Đặng Anh Quân","12345", "student");
		String id = "B17DCCN496";
		User expect = instance.getIdUser(id);
		assertEquals(expect.toString(), user.toString());
		
	}
	//sai idUser
	public void testLoginFail() {
		UserDaoImpl instance = new UserDaoImpl();
		User user = new User("B17DCCN496","Đặng Anh Quân","12345", "student");
		String id = "B17DCCN495";
		User expect = instance.getIdUser(id);
		assertNotEquals(expect.toString(), user.toString());
	}
	//sai password
	public void testLoginFail1() {
			UserDaoImpl instance = new UserDaoImpl();
			User user = new User("B17DCCN496","Đặng Anh Quân","123456", "student");
			String id = "B17DCCN496";
			User expect = instance.getIdUser(id);
			assertNotEquals(expect.toString(), user.toString());
		}
	//khong nhap idUser/password
	public void testLoginEmpty() {
			UserDaoImpl instance = new UserDaoImpl();
			String id = "";
			User expect = instance.getIdUser(id);
			assertFalse(expect.toString().isEmpty());
		}
}
