package com.mycompany.labexam;

import java.util.*;

public class WordOccerence {

        public static void main(String[] Args){

                Scanner scan = new Scanner(System.in);
                HashMap map = new HashMap();
                ArrayList <String> newList = new ArrayList();
                
                System.out.print("Enter Input: ");
                String userInput = scan.nextLine();
                String[] temp = userInput.split(" ");
                
                for(int i = 0; i<= userInput.length(); i++ ){
                    newList.add(temp[i]);
                }
                    
                    
                    
                for(int i = 0;i <= userInput.length(); i++ ){
                        
                    System.out.println(temp[i]);
                        
                }
                
                map.put(map,map);
                    
        }   

}
