package com.dinu;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterInString {
	public static void main(String[] args) {
		String str="javavvnn";
		displayDuplicates (str);
	}
	public static void displayDuplicates(String str){
		Map<Character,Integer> map=new HashMap<>();
		char[] character=str.toCharArray();
		for (char c : character) {
			if(!map.containsKey(c)){
				map.put(c, 1);
			}
			else{
				
				map.put(c, map.get(c)+1);
			}
			
			Set<Map.Entry<Character, Integer>> entrySet=map.entrySet();
			for (Entry<Character, Integer> entry : entrySet) {
				if(entry.getValue()>1){
					System.out.printf("%s: %d %n",entry.getKey(),entry.getValue());
				}
				
			}
		}
		
		
	}

}
