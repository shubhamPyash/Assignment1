
package springCoreAssignment10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Studentt
{
	 HashMap<String, Integer> stud;

	 
//	public Studentt(HashMap<String, Integer> stud) 
//	{
//		super();
//		this.stud = stud;
//	}
	 
	 public HashMap<String, Integer> getStud() {
		 
		 System.out.println(stud);
		 
		 System.out.println("Sorting");
		 Map<String, Integer> objdf=stud.entrySet().stream().sorted(Map.Entry.comparingByValue()).
				 collect(Collectors.toMap(Map.Entry :: getKey ,Map.Entry :: getValue , (a1,a2) -> a1 ,LinkedHashMap :: new));
		System.out.println(objdf);
		
		 return stud;
	}


	public void setStud(HashMap<String, Integer> stud)
	{
		
		this.stud = stud;
	}


	@Override
	public String toString() {
		return "Studentt [stud=" + stud + "]";
	}


	public Studentt() 
	 {
		 super();
	 }
	 
	 
}
