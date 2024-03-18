package com.gectcr.mca2023.s2.oop;
import java.util.*;
public class Studentmap{
  public static Map<Integer,String> insert(Map<Integer,String> map){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the key and value to insert:");
    int key = in.nextInt();
    String value = in.next();
    map.put(key,value);
    return(map);
  }
  
  public static  void GetName(Map<Integer,String> map){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the key");
    int  key = in.nextInt();
    System.out.println(key+":"+map.get(key));
 }
 
  public static  void GetRollNo(Map<Integer,String> map){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value");
    String value  = in.next();
    for(Map.Entry<Integer,String> i:map.entrySet()){
      if(i.getValue().equals(value)){
        System.out.println(i.getKey()+":"+map.get(i.getKey())); 
      }
    }
 }
 
  public static  Map<Integer,String> RemoveWithRollNo(Map<Integer,String> map){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the RollNo(key)");
    int rollNo  = in.nextInt();
    if(map.containsKey(rollNo)){
      map.remove(rollNo);
    }
    else{
      System.out.println("The roll no does not exist");
    }
    return map;
 }
 
  public static  Map<Integer,String> RemoveWithName(Map<Integer,String> map){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Name(value)");
    String name  = in.next();
    if(map.containsValue(name)){
      for(Map.Entry<Integer,String> i:map.entrySet()){
        if(i.getValue().equals(name)){
          int k = i.getKey();
          map.remove(k); 
        }
      }
    }
    else{
      System.out.println("The name does not exist"); 
    }
    return map;
 }
    
  public static void display(Map<Integer,String> map){
  for(int i:map.keySet())
   System.out.println(i+" "+map.get(i));
  
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = in.nextInt();
    Map<Integer,String> obj = new HashMap<Integer,String>(n);
    for(int i=0;i<n;i++){
      System.out.println("Key-Value pair "+(i+1));
      obj.put(in.nextInt(),in.next());
    }
     
    while(true){
      System.out.println(" Menu \n 1.Get name\n 2.Get roll no.\n 3.Display\n 4.Insert\n 5.Remove with roll no.\n 6.Remove with name\n 7.Exit");
      System.out.println("Enter the choice:");
      int ch = in.nextInt();
      switch(ch){
        case 1:
          GetName(obj);
          break;
        case 2:
          GetRollNo(obj);
          break;            
        case 3:
          display(obj);
          break;
        case 4:
          obj = insert(obj);
          break;   
        case 5:
          obj = RemoveWithRollNo(obj);
          break;
        case 6:
          obj = RemoveWithName(obj);
          break;
        case 7:
          System.out.println("Exiting the program");
          return;                                 
        default:
          System.out.println("Invalid choice");
      }
    } 
  }
}