package J04013;

public class SV {
	private String maSV,name,maKV,trang_thai;
	private double toan,ly,hoa,diem_ut,tong,tong_ut;
	
	public SV(String maSV,String name,double toan,double ly,double hoa) {
		super();
		this.maSV = maSV;
		this.name = name;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	
	public void solve() {
		maKV="";
		maKV=maKV+maSV.charAt(0)+maSV.charAt(1)+maSV.charAt(2);
		
		if(maKV.equals("KV1")) {
			diem_ut=0.5;
		}else if(maKV.equals("KV2")) {
			diem_ut=1.0;
		}else {
			diem_ut=2.5;
		}
		tong=toan*2+ly+hoa;
		tong_ut=tong+diem_ut;
	
		//trang thai
		if(tong_ut>=24) {
			trang_thai="TRUNG TUYEN";
		}else {
			trang_thai="TRUOT";
		}
	}
	@Override
	public String toString() {
		if(maKV.equals("KV2") ) {
			if(tong-(int)tong==0.0) {
				return maSV+" "+name+" "+(int)diem_ut+" "+(int)tong+" "+trang_thai;
			}
			return maSV+" "+name+" "+(int)diem_ut+" "+tong+" "+trang_thai;
		}
		if(tong-(int)tong==0.0) {
			return maSV+" "+name+" "+diem_ut+" "+(int)tong+" "+trang_thai;
		}
		return maSV+" "+name+" "+diem_ut+" "+tong+" "+trang_thai;
	}
}