package test.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javaPractise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String> a = new ArrayList<String>();
		a.add("Vishnu");
		a.add("User");
		System.out.println(a);
		
		System.out.println("***********");
		
	 String[] name = {"Vishnu","Shekar","MC"};
	 
	List<String>nameList = Arrays.asList(name);
	System.out.println(nameList.contains("Vishnu"));
	
	
	
		
		
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]%2==0) {
			
			System.out.println(arr[i]);	
			}
			else {
				
				System.out.println(arr[i]+"not a even");	
			}
			
			
			
		}

	}

}
