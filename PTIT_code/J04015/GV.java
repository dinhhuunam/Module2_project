package J04015;

public class GV {
	private String maGV,name,level_salary,position;
	private long luong, phu_cap, tong,salary;
	
	public GV(String maGV, String name, long luong) {
		super();
		this.maGV = maGV;
		this.name = name;
		this.luong = luong;
	}
	public void solve() {
		this.position="";
		this.position+=maGV.charAt(0)+maGV.charAt(1);
		if(this.position.equals("HT")){
			this.phu_cap = 2000000;
		}else if(this.position.equals("HP")) {
			this.phu_cap = 900000;
		}else {
			this.phu_cap = 500000;
		}
		level_salary="";
		level_salary+=maGV.charAt(2)+maGV.charAt(3);
		salary = Long.parseLong(level_salary);
		tong = luong * salary +  phu_cap;
	}
	@Override
	public String toString() {
		return this.maGV+" "+this.name+" "+this.salary+" "+phu_cap+" "+tong;
	}
}