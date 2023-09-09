package J04012;

//Bài toán tính công
public class NV {
	private String maNV, name,level;
	private long luongcb, ngay_cong, tien_thuong, phu_cap, tien_luong, thu_nhap;
	
	public NV(String name, long luongcb, long ngay_cong,String level) {
		super();
		this.name = name;
		this.level = level;
		this.luongcb = luongcb;
		this.ngay_cong = ngay_cong;
	}
	
	public void solve() {
		maNV="NV01";
		tien_luong=luongcb*ngay_cong;
		//tien thuong
		if(ngay_cong>=25) {
			tien_thuong = (tien_luong*20)/100;
		}else if(ngay_cong>=22 && ngay_cong<25) {
			tien_thuong = (tien_luong*10)/100;
		}else {
			tien_thuong=0;
		}
		//phu cap
		if(level.equals("GD")) {
			phu_cap=250000;
		}else if(level.equals("PGD")) {
			phu_cap=200000;
		}else if(level.equals("TP")) {
			phu_cap=180000;
		}else {
			phu_cap=150000;
		}
		//thu nhap
		thu_nhap=tien_luong+tien_thuong+phu_cap;
	}
	@Override
	public String toString() {
		return maNV+" "+name+" "+tien_luong+" "+tien_thuong+" "+phu_cap+" "+thu_nhap;
	}
}