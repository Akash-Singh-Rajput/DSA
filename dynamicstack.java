package com.DSABOOTCAMP;
import java.sql.Array;
import java.util.*;


public class dynamicstack {

    int top = 0;
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isempty(){
        return list.size() == 0;
    }

    public void push(int element){
        list.add(element);
        top = top + 1;
    }
    public void pop(){
        if(isempty()){
            System.out.println("stack is empty");
        }else {
            list.remove(list.size() - 1);
            top = top - 1;
        }

    }
    public void peek(){
        if( isempty()){
            System.out.println("paagal vaagal hai kya");
        }else {

            System.out.println(list.get(list.size() - 1));
        }
    }

    public void size(){
        System.out.println(list.size());
    }
    public void display(){
        System.out.println(list);
    }
}
