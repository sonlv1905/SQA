package model;

public class KiHoc {
	private int idKiHoc;
	private String tenKiHoc;
	

	public KiHoc() {
		super();
	}

	public KiHoc(int idKiHoc, String tenKiHoc) {
		super();
		this.idKiHoc = idKiHoc;
		this.tenKiHoc = tenKiHoc;
	}

	public int getIdKiHoc() {
		return idKiHoc;
	}

	public void setIdKiHoc(int idKiHoc) {
		this.idKiHoc = idKiHoc;
	}

	public String getTenKiHoc() {
		return tenKiHoc;
	}

	public void setTenKiHoc(String teKiHoc) {
		this.tenKiHoc = teKiHoc;
	}

	@Override
	public String toString() {
		return "KiHoc [idKiHoc=" + idKiHoc + ", tenKiHoc=" + tenKiHoc + "]";
	}
	

}
