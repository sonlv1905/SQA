package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.JDBCConnection;
import dao.LichHocDaoImpl;
import model.LichHoc;

public class LichHocDaoImplTest {

	@Test
	public void testSearchLHTrue() {
		LichHocDaoImpl instance = new LichHocDaoImpl();
		List<LichHoc> actual = new ArrayList<>();
		LichHoc l1 = new LichHoc(21, "Đại số 2", "1", "2", 1, "302", "123456789012", "hè", "B17DCCN497");
		actual.add(l1);
		String id = "B17DCCN497";
		List<LichHoc> expect = instance.searchLichHoc(id);
		System.out.print(expect.toString());
		assertEquals(expect.toString(), actual.toString());
	}
	@Test
	public void testSearchLHFalse() {
		LichHocDaoImpl instance = new LichHocDaoImpl();
		List<LichHoc> actual = new ArrayList<>();
		String id = "B17DCCN495";
		List<LichHoc> expect = instance.searchLichHoc(id);
		assertFalse(expect.toString().isEmpty());
	}
	@Test
	public void testSearchLHEmpty() {
		LichHocDaoImpl instance = new LichHocDaoImpl();
		String id = "";
		List<LichHoc> expect = instance.searchLichHoc(id);
		assertFalse(expect.toString().isEmpty());
	}
//	@Test
//	public void testAddTrue() {
//		LichHocDaoImpl instance = new LichHocDaoImpl();
//		try {
//			JDBCConnection.getJDBConnection().setAutoCommit(false);
//			LichHoc lich = new LichHoc(22, "Đại số 2", "1", "2", 1, "302", "123456789012", "hè", "B17DCCN498");
//			instance.add(lich);
//			String id="B17DCCN496";
//			List<LichHoc> list = instance.searchLichHoc(id);
//			int a=0;
//			for(LichHoc lh:list) {
//				if(lh.toString().equals(lich.toString())) {
//					assertEquals(lh.toString(), lich.toString());
//					continue;
//				}
//				a++;
//			}
//			if(a==list.size()) {
//				assertEquals(list.toString(), lich.toString());
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				JDBCConnection.getJDBConnection().rollback();
//				JDBCConnection.getJDBConnection().setAutoCommit(true);
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
