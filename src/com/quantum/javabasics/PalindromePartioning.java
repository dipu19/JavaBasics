import java.util.*;
public class PalindromePartioning {
  public static void main(String[] args)
  {
	  String s = "ab";
	  HashMap <String,Integer>hm = new HashMap<String,Integer>();
	  for(int i=0;i<s.length();i++)
	  {
		  if(hm.get(""+s.charAt(i)) == null)
		  {
			  hm.put(""+s.charAt(i), 1);
		  }
		  else
		  {
			  hm.put(""+s.charAt(i),hm.get(""+s.charAt(i))+1);
		  }
	  }
	  System.out.println(hm.size()-1);
  }
}
