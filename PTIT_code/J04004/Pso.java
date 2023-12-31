package J04004;

public class Pso {
	private long tso;
	private long mso;
	
	public Pso() {
	}
	public Pso(long tso, long mso) {
		super();
		this.tso = tso;
		this.mso = mso;
	}
	public long gcd(long a,long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public void rutGon() {
		long z=gcd(this.tso,this.mso);
		this.tso/=z;
		this.mso/=z;
	}
	public void tong(Pso p) {
		this.rutGon();
		p.rutGon();
		Pso p1=new Pso();
		p1.tso=this.tso*p.mso+this.mso*p.tso;
		p1.mso=this.mso*p.mso;
		p1.rutGon();
		System.out.println(p1);
	}
	@Override
	public String toString() {
		return tso+"/"+mso;
	}
}