package model;

public class MonHoc {
	private String idMonHoc;
	private String tenMonHoc;
	private int soTinChi;
	private String nganhHoc;
	

	public MonHoc() {
		super();
	}

	public MonHoc(String idMonHoc, String tenMonHoc, int soTinChi, String nganhHoc) {
		super();
		this.idMonHoc = idMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.soTinChi = soTinChi;
		this.nganhHoc = nganhHoc;
	}

	public String getIdMonHoc() {
		return idMonHoc;
	}

	public void setIdMonHoc(String string) {
		this.idMonHoc = string;
	}

	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	

	public String getNganhHoc() {
		return nganhHoc;
	}

	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}

	@Override
	public String toString() {
		return "MonHoc [idMonHoc=" + idMonHoc + ", tenMonHoc=" + tenMonHoc + ", soTinChi=" + soTinChi + ", nganhHoc="
				+ nganhHoc + "]";
	}

	
	
	

}
