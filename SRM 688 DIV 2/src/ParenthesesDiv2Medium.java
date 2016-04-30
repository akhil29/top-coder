import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Medium {
	
	public int[] correct(String s) {

		int n = s.length() ;
		ArrayList<Integer> ans = new ArrayList<>() ;
		Stack<Character> st = new Stack<>() ;
		for(int i = 0 ; i < s.length() ; i++){
			char now = s.charAt(i) ;
			n--;
			if(now == ')' && st.isEmpty()){
				ans.add(i) ;
				st.push('(');
			}else if(now == '(' && st.size() + 1 > n){
				ans.add(i) ;
				st.pop();
			}else {
				if(now == '(')
					st.push(now) ;
				else
					st.pop() ;
			}
		}
		int[] ret = new int[ans.size()] ;
		for(int i = 0 ; i < ans.size() ; i++){
			ret[i] = ans.get(i) ;
		}
		return ret;
	}
}
