package J04022;

import java.util.Set;
import java.util.TreeSet;

public class WordSet {
	private String s;
	
	public WordSet(String s) {
		this.s=s;
	}
	public String union(WordSet s1) {
		String res="";
		Set<String> st=new TreeSet<>();
		s1.s=s1.s.toLowerCase();
		this.s=this.s.toLowerCase();
		String[] s2=this.s.split(" ");
		String[] s3=s1.s.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			st.add(s2[i]);
		}
		for(int i=0;i<s3.length;i++) {
			st.add(s3[i]);
		}
		
		for(String s:st) {
			res=res+s;
			res=res+" ";
		}
		res=res.trim();
		return res;
	}
	public String intersection(WordSet s1) {
		String ans=" ";
		Set<String> st=new TreeSet<>();
		s1.s=s1.s.toLowerCase();
		this.s=this.s.toLowerCase();
		String[] s2=this.s.split(" ");
		String[] s3=s1.s.split(" ");
		
		for(String s:s2) {
			for(String res:s3) {
				if(s.equals(res)) {
					st.add(s);
				}
			}
		}
		for(String s:st) {
			ans=ans+s;
			ans=ans+" ";
		}
		ans=ans.trim();
		return ans;
	}
}