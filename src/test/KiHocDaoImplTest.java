package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.KiHocDao;
import dao.KiHocDaoImpl;
import model.KiHoc;

public class KiHocDaoImplTest {

	@Test
	public void testSearchKHByTKHTrue() {
		KiHocDaoImpl instance = new KiHocDaoImpl();
		KiHoc ki = new KiHoc(1,"1");
		String ten = "1";
		KiHoc expect = instance.search1(ten);
		assertEquals(expect.toString(), ki.toString());
	}
	@Test
	public void testSearchKHByTKHFail() {
		KiHocDaoImpl instance = new KiHocDaoImpl();
		String ten = "10";
		KiHoc expect = instance.search1(ten);
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchKHByTKHEmpty() {
		KiHocDaoImpl instance = new KiHocDaoImpl();
		String ten = "";
		KiHoc expect = instance.search1(ten);
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchKHTrue() {
		KiHocDaoImpl instance = new KiHocDaoImpl();
		List<KiHoc> actual = new ArrayList<>();
		KiHoc ki = new KiHoc(1,"1");
		actual.add(ki);
		String ten = "1";
		List<KiHoc> expect = instance.search(ten);
		assertEquals(expect.toString(), actual.toString());
	}
	@Test
	public void testSearchKHFail() {
		KiHocDaoImpl instance = new KiHocDaoImpl();
		String ten = "10";
		List<KiHoc> expect = instance.search(ten);
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchKHEmpty() {
		KiHocDaoImpl instance = new KiHocDaoImpl();
		List<KiHoc> actual = new ArrayList<>();
		String ten = "";
		List<KiHoc> expect = instance.search(ten);
		assertFalse(expect.toString().isEmpty());
	}

}
