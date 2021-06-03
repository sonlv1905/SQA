package model;

public class LichHoc {
	private int idLichHoc;
	private String tenMonHoc;
	private String nhomMonHoc;
	private String thu;
	private int kip;
	private String phong;
	private String tuan;
	private String kiHoc;
	private String idSinhVien;
	
	
	
	public LichHoc() {
		super();
	}
	
	
	
	public LichHoc(int idLichHoc, String tenMonHoc, String nhomMonHoc, String thu, int kip, String phong, String tuan,
			String kiHoc, String idSinhVien) {
		super();
		this.idLichHoc = idLichHoc;
		this.tenMonHoc = tenMonHoc;
		this.nhomMonHoc = nhomMonHoc;
		this.thu = thu;
		this.kip = kip;
		this.phong = phong;
		this.tuan = tuan;
		this.kiHoc = kiHoc;
		this.idSinhVien = idSinhVien;
	}



	public int getIdLichHoc() {
		return idLichHoc;
	}
	public void setIdLichHoc(int idLichHoc) {
		this.idLichHoc = idLichHoc;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public String getNhomMonHoc() {
		return nhomMonHoc;
	}
	public void setNhomMonHoc(String nhomMonHoc) {
		this.nhomMonHoc = nhomMonHoc;
	}
	public String getThu() {
		return thu;
	}
	public void setThu(String thu) {
		this.thu = thu;
	}
	public int getKip() {
		return kip;
	}
	public void setKip(int kip) {
		this.kip = kip;
	}
	public String getPhong() {
		return phong;
	}
	public void setPhong(String phong) {
		this.phong = phong;
	}
	public String getTuan() {
		return tuan;
	}
	public void setTuan(String tuan) {
		this.tuan = tuan;
	}
	public String getKiHoc() {
		return kiHoc;
	}
	public void setKiHoc(String kiHoc) {
		this.kiHoc = kiHoc;
	}
	public String getIdSinhVien() {
		return idSinhVien;
	}
	public void setIdSinhVien(String idSinhVien) {
		this.idSinhVien = idSinhVien;
	}

	@Override
	public String toString() {
		return "LichHoc [idLichHoc=" + idLichHoc + ", tenMonHoc=" + tenMonHoc + ", nhomMonHoc=" + nhomMonHoc + ", thu="
				+ thu + ", kip=" + kip + ", phong=" + phong + ", tuan=" + tuan + ", kiHoc=" + kiHoc + ", idSinhVien="
				+ idSinhVien + "]";
	}
	
	
	
}
