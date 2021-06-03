package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.NganhHocDaoImpl;
import model.NganhHoc;

public class NganhHocDaoImplTest {

	@Test
	public void testSearchNHByTenTrue() {
		NganhHocDaoImpl instance = new NganhHocDaoImpl();
		NganhHoc nganh = new NganhHoc(1, "CNTT");
		List<NganhHoc> actual = new ArrayList<>();
		actual.add(nganh);
		String ten = "CNTT";
		List<NganhHoc> expect = instance.search(ten);
		System.out.println(expect.toString());
		assertEquals(expect.toString(), actual.toString());
	}
	@Test
	public void testSearchNHByTenFail() {
		NganhHocDaoImpl instance = new NganhHocDaoImpl();
		String ten = "ATTT";
		List<NganhHoc> expect = instance.search(ten);
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchNHByTenEmpty() {
		NganhHocDaoImpl instance = new NganhHocDaoImpl();
		String ten = "";
		List<NganhHoc> expect = instance.search(ten);
		assertFalse(expect.toString().isEmpty());
	}
	
	@Test
	public void testSearchByTenTrue() {
		NganhHocDaoImpl instance = new NganhHocDaoImpl();
		NganhHoc nganh = new NganhHoc(1, "CNTT");
		String ten = "CNTT";
		NganhHoc expect = instance.search1(ten);
		assertEquals(expect.toString(), nganh.toString());
	}
	@Test
	public void testSearchByTenFail() {
		NganhHocDaoImpl instance = new NganhHocDaoImpl();
		String ten = "ATTT";
		NganhHoc expect = instance.search1(ten);
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchByTenEmpty() {
		NganhHocDaoImpl instance = new NganhHocDaoImpl();
		String ten = "";
		NganhHoc expect = instance.search1(ten);
		assertFalse(expect.toString().isEmpty());
	}

}
