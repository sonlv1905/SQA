package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.MonHocDaoImpl;
import model.MonHoc;

public class MonHocDaoImplTest {

	@Test
	public void testSearchMHByIdTrue() {
		MonHocDaoImpl instance =new MonHocDaoImpl();
		MonHoc mon = new MonHoc("INT12345", "Đại số 2", 3, "CNTT");
		String id = "INT12345";
		MonHoc expect = instance.search1(id);
		System.out.println(expect.toString());
		assertEquals(expect.toString(), mon.toString());
	}
	@Test
	public void testSearchMHByIdFail() {
		MonHocDaoImpl instance =new MonHocDaoImpl();
		String id = "INT12111";
		MonHoc expect = instance.search1(id);
		//System.out.println(expect.toString());
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchMHByIdEmpty() {
		MonHocDaoImpl instance =new MonHocDaoImpl();
		String id = "";
		MonHoc expect = instance.search1(id);
		//System.out.println(expect.toString());
		assertFalse(expect.toString().isEmpty());
	}
	
	@Test
	public void testSearchMHByNHKHTrue() {
		MonHocDaoImpl instance =new MonHocDaoImpl();
		MonHoc mon = new MonHoc("INT12345", "Đại số 2", 3, "CNTT");
		List<MonHoc> actual = new ArrayList<>();
		actual.add(mon);
		String nganh = "CNTT";
		String ki = "2";
		List<MonHoc> expect = instance.search2(nganh,ki);
		//System.out.println(expect.toString());
		assertEquals(expect.toString(), actual.toString());
	}
	@Test
	public void testSearchMHByNHKHFailNH() {
		MonHocDaoImpl instance =new MonHocDaoImpl();
		String nganh = "ATTT";
		String ki = "2";
		List<MonHoc> expect = instance.search2(nganh,ki);
		//System.out.println(expect.toString());
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchMHByNHKHFailKH() {
		MonHocDaoImpl instance =new MonHocDaoImpl();
		String nganh = "CNTT";
		String ki = "3";
		List<MonHoc> expect = instance.search2(nganh,ki);
		//System.out.println(expect.toString());
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchMHByNHKHEmpty() {
		MonHocDaoImpl instance =new MonHocDaoImpl();
		String nganh = "";
		String ki = "";
		List<MonHoc> expect = instance.search2(nganh,ki);
		//System.out.println(expect.toString());
		assertFalse(expect.toString().isEmpty());
	}

}
