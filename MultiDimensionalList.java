// package com.DSABOOTCAMP;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimensionalList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            list.add(new ArrayList<>());          // Initialising the ArrayList
        }
        for(int i = 0; i < m; i++){       // This will associate the list
            for(int j = 0; j < 3; j++) {  //This will take care of no. of object that's going to be add in each ArrayList
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list.get(0).get(2));
        System.out.println(list);
    }
}
