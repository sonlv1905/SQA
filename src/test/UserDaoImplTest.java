package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.UserDaoImpl;
import model.User;

public class UserDaoImplTest {

	@Test
	public void testGetIdUserTrue() {
		UserDaoImpl instance = new UserDaoImpl();
		User expect = new User("B17DCCN496","Đặng Anh Quân","12345", "student");
		String id ="B17DCCN496";
		User actual = instance.getIdUser(id);
		System.out.print(actual.toString());
		assertEquals(expect.toString(), actual.toString());	
	}
	@Test
	public void testGetIdUserFail() {
		UserDaoImpl instance = new UserDaoImpl();
		String id ="B17DCCN111";
		User expect = instance.getIdUser(id);
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testGetIdUserNull() {
		UserDaoImpl instance = new UserDaoImpl();
		String id =null;
		User actual = instance.getIdUser(id);
		assertFalse(actual.toString().isEmpty());	
	}
	
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
	@Test
	public void testLoginFail() {
		UserDaoImpl instance = new UserDaoImpl();
		User user = new User("B17DCCN496","Đặng Anh Quân","12345", "student");
		String id = "B17DCCN495";
		User expect = instance.getIdUser(id);
		assertNotEquals(expect.toString(), user.toString());
	}
	//sai password
	@Test
	public void testLoginFail1() {
		UserDaoImpl instance = new UserDaoImpl();
		User user = new User("B17DCCN496","Đặng Anh Quân","123456", "student");
		String id = "B17DCCN496";
		User expect = instance.getIdUser(id);
		assertNotEquals(expect.toString(), user.toString());
	}
	//khong nhap idUser/password
	@Test
	public void testLoginEmpty() {
		UserDaoImpl instance = new UserDaoImpl();
		String id = "";
		User expect = instance.getIdUser(id);
		assertFalse(expect.toString().isEmpty());
	}
	
}
