import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object,Object> map=new HashMap<Object,Object>();
		map.put("1", "Gajendra Singh");
		map.put("2", "Dilip Singh");
		map.put("3", "samar Singh");
		map.put("4", "prashanth Singh");
		map.put("5", "vinod ");
		map.put("6", "santosh Singh");
		map.put("7", "rakesh Singh");
		map.put("8", "aashish Singh");
		map.put("9", "ashok Singh");
		map.put("null", "null");
		map.put("11", "sonu Singh");
		map.put("12", "kamal Singh");
		for(Object key:map.keySet())
		{
			//String val=(String) map.get(key);
			if(key.equals(null))
			{
				System.out.println("Found");
				break;
			}else
			{
				continue;
			}
			
		}

	}

}
