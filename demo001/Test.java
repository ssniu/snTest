package class006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res = new ArrayList<>();
		for(List<String> a : res) {
			for(String b : a) {
				System.out.print(b + " , ");
			}
			System.out.println();
		}

	}
	
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<Integer, List<String>> map = new HashMap<>();
        for(String s : strs){
            int tmp = 0;
            for(char ch :s.toCharArray()){
                tmp += ch;
            }
            System.out.println(" : " + tmp);
            if(!map.get(tmp).contains(s)){
               List<String> ans = new ArrayList<>();
               ans.add(s);
               map.put(tmp, ans);
            }else{
                List<String> ans = map.get(tmp);
               ans.add(s);
               map.put(tmp, ans);
              // map.put(tmp, map.get(tmp).add(s));
            }
            
        }
        for(Map.Entry<Integer,List<String>> a : map.entrySet()){
           System.out.println(a.getKey() + " : " + a.getValue());
           res.add(a.getValue());
        }
        return res;
    }

}
