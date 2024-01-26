package entities;

public class Class {
	private String maLop;
	private String tenLop;
	private String tenKhoa;
	private int siSoLop;

	public void test() {
	};

	public void test1() {
	};

	public void Test(String name) {
	};

	public Class(String maLop, String tenLop, String tenKhoa, int siSoLop) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.tenKhoa = tenKhoa;
		this.siSoLop = siSoLop;
	}

	public Class() {
		// TODO Auto-generated constructor stub
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public int getSiSoLop() {
		return siSoLop;
	}

	public void setSiSoLop(int siSoLop) {
		this.siSoLop = siSoLop;
	}

	@Override
	public String toString() {
		return "Class [maLop=" + maLop + ", tenLop=" + tenLop + ", tenKhoa=" + tenKhoa + ", siSoLop=" + siSoLop + "]";
	}

}
