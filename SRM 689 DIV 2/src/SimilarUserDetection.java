import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SimilarUserDetection {
	
	public String haveSimilar(String[] handles) {
        int n = handles.length ;
        for(int i = 0 ; i < n ; i++){
            handles[i] = handles[i].replace('0','O') ;
            handles[i] = handles[i].replace('1','l') ;
            handles[i] = handles[i].replace('I','l') ;
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(handles[i].equals(handles[j]))
                    return "Similar handles found" ;
            }
        }

        return "Similar handles not found" ;
	}
}
