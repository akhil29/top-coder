import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NonDeterministicSubstring {
	
	public long ways(String A, String B) {
		int a = A.length(),b= B.length() ;
//		System.out.println(A+" "+B);
		HashSet<String> hs = new HashSet<>() ;
		int ans = 0 ;
		for(int i = 0 ; i + b <= a ; i++){
			if(eql(A.substring(i, i + b), B) && !hs.contains(A.substring(i,i+b))) {
				ans++;
				hs.add(A.substring(i,i+b)) ;
			}
		}
		return ans;
	}

	private boolean eql(String a, String b) {
		for(int i = 0 ; i < a.length() ; i++){
			if(a.charAt(i) != b.charAt(i) && b.charAt(i) != '?')
				return false ;
		}
		return true ;
	}
}
