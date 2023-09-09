package J04003;

public class PSo {
	private long x,y;

	public PSo(long x, long y) {
		super();
		this.x = x;
		this.y = y;
	}
	public long gcd(long a,long b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}
	public void rutGon() {
		long z=gcd(this.x,this.y);
		this.x/=z;
		this.y/=z;
	}
	@Override
	public String toString() {
		return this.x + "/" + this.y;
	}
}