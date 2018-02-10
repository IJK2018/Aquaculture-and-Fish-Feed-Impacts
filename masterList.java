/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishackathon;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 46158
 */
public class masterList {
    ArrayList<String> feedName;
    ArrayList <Integer> cost;
    
    
    public static void main(String[] args) {
        String choice;

    }
    
    public masterList(){
        feedName = new ArrayList();
    }
    //Arrays.sort(feedName)
    
    
    public void sortAZ(String name){
        feedName.add(name);
        Collections.sort(feedName, String.CASE_INSENSITIVE_ORDER);
    }
    
    public void getSortedAZ(){
        for (int i = 0; i < feedName.size(); i++) {
            System.out.println(feedName.get(i));
        }
    }
    
    public void getSortZA(){
        for (int i = feedName.size(); i == 0; i--) {
            System.out.println(feedName.get(i));
        }
    }
    
    public void addCost(int n){
        cost.add(n);
    }
    
    public void CostHighest(){
        int max = 0;
        for (int i = 0; i < cost.size(); i++) {
            if(max < cost.get(i)){
                max = cost.get(i);
            }
        }
    }
    public void CostLowest(){
        int min = 0;
        for (int i = 0; i < cost.size(); i++) {
            if(min > cost.get(i)){
                min = cost.get(i);
            }
        }
    }
    public void search(String name){
        for (int i = 0; i < feedName.size(); i++) {
            if(feedName.get(i) == name){
                System.out.println(feedName.get(i));
            }
        }
    }
}
