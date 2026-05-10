package class004;

import java.util.HashSet;
import java.util.TreeSet;

public class TestSkip {

	public static void main(String[] args) {
//		String s = "*** CERTIFACATE \n**";
//		String s1 = "***";
//		String s2 = s1.replaceAll("\\**","");
//		System.out.println(s1.contains("**"));
//		System.out.println(s.contains("CERTIFACATE"));
//		System.out.println(s1.replaceAll("\\**",""));
		double s2 = -1/2;
		System.out.println(s2);
//		String s = "3,000.25";
//		String s1 = s.replace(",", "");
//		String s = "3,000.25 USD";
//		String s1 = "GU";
//		System.out.println(s1.matches("\\D+"));
//		System.out.println(s.matches("\\D+"));
//		HashSet<Integer> set = new HashSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		System.out.println(set.iterator().next());
//		TreeSet<String> cars2 = new TreeSet<>();
//	    cars2.add("Volvo");
//	    cars2.add("BMW");
//	    cars2.add("Ford");
//	    //cars2.add("BMW");  // Duplicate
//	    cars2.add("Mazda");
	    //System.out.println(cars2);
	    int[] arr1 = {1,2,3,4,5};
	    int[] arr2 = {4,5,6,7,8};
	    for(int i : arr1) {
	    	if(i == 3) {
	    		//System.out.print(i + " ; ");
	    		continue;
	    	}
	    	System.out.println();
	    	for(int j : arr2) {
	    		System.out.println(j + " ; " + i);
	    	}
	    }
	    
//		 HashSet<String> cars = new HashSet<String>();
//		    cars.add("Volvo");
//		    cars.add("BMW");
//		    cars.add("Ford");
//		    cars.add("BMW");  // Duplicate
//		    cars.add("Mazda");
//		    System.out.println(cars);
//		String[] arr = new String[20];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = "string num " + i;
//		}
//        boolean isSkip = false;
//        for(int i = 0; i < arr.length; i++) {
//        	if(arr[i].contains("6")) {
//        		isSkip = true;
//        		continue;
//        	}
//        	if(arr[i].contains("11")) {
//        		isSkip = false;
//        	}
//
//        	if(!isSkip) {
//        		System.out.println(arr[i] + " ; ");
//        	}
//        }
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i;
//		}
//        boolean isSkip = false;
//        for(int i = 0; i < arr.length; i++) {
//        	if((arr[i] > 6 && arr[i] <= 9) || (arr[i] > 12 && arr[i] < 15)) {
//        		isSkip = true;
//        	}else {
//        		isSkip = false;
//        	}
//
//        int k = 3;
//        	while(k > 1) {
//        		k--;
//        		System.out.print(k + " ; ");//2 1
//        	}
//        }
	}

}
