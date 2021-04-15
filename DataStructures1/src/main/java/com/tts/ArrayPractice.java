package com.tts;

import java.io.Console;
import java.util.*;

public class ArrayPractice {
    public static void main(String[] args){
        //sting array
        String[] fruitArray = {"orange", "apple", "dragonfruit"};
        //int array
        int[] intArray;
        //boolean array
        boolean[] boolArray;



        //print apple
        System.out.println("====== Arrays =====");
        System.out.println(fruitArray[1]);
        System.out.println(fruitArray.length);



        //examples of different types of Lists
        List <String> stringList= new ArrayList();
        List <String> stringLinkedList = new LinkedList();
        List <String> stringVector = new Vector();
        List <String> stringStack = new Stack();

        stringList.add("dog");
        stringList.add("house");
        stringList.add("cell phone");


        // {dog, house, cell phone}
        stringList.add(1, "cat");
        // {dog, cat, house, cell phone}
        System.out.println("The element at index 0: " + stringList.get(1));
        stringList.remove(0);
        System.out.println("This is the size of my list: " + stringList.size());
        // this is completely remove all elements from your list
//        stringList.clear();
        Collections.reverse(stringList);
        System.out.println("Here is my list reversed: " + stringList);

        System.out.println("\n==== String Conversion ====");

        String myString = "I really love icecream!";
        String[] strArr = myString.split(" ");

        List <String> splitList = new ArrayList<>();

        splitList = Arrays.asList(strArr);
        System.out.println(splitList);

        List<String> carList  = Arrays.asList("BMW","Honda","Audi");

        Object[] carArr = carList.toArray();

        String carString = Arrays.toString(carArr);

        System.out.println(carString.replace("[","")
        .replace("]","")
        .replace(","," "));




       //Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<String, Integer> personMap = new HashMap<>();

//.put adds items to the hash map
        personMap.put("Mary", 21);
        personMap.put("Bob", 34);
        personMap.put("Susan", 63);


        //creates the following HashMap
        //=> {Joan=21, Mike=55, Daniel=42, Anna=34}
        System.out.println("\n====== HashMap =====");
        System .out.println(personMap);

        //.get retrieves data from the hash map
        System.out.println("This is the value associated with Mary: "+ personMap.get("Mary"));
        //=> 21 //returns the value associated with the key

        //Enhanced for loop
        for(String i : personMap.keySet()){
            System.out.println("Key: " + i + "\tValue: " + personMap.get(i));
        }
        //Enhanced for loop with map entry
        for (Map.Entry<String, Integer> entry : personMap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        personMap.remove("Bob");
        System.out.println("Is Bob in my map? " + personMap.containsKey("Bob"));



        List<String> fruitList = Arrays.asList("plum","grape","fiji apple");

        // This is refered to as an enhanced for loop
        // enhanced for loops are strictly used for collections
        // String fruit represents any given element in our fruitList collection

        System.out.println("===== Iterating ====");
        for (String fruit : fruitList){

            System.out.println("My fruit is: " + fruit);

        }

        System.out.println();


        List<String> fruitList2 = new ArrayList<>();
        fruitList2.add("Apple");
        fruitList2.add("Banana");
        fruitList2.add("Grapes");

        for (String fruits : fruitList2){

            System.out.println("This is my second fruitList: " + fruits);
        }

        System.out.println();

        //forEach example
        //lamda expression
        fruitList.forEach((fruits) -> System.out.println("This is my fruits using a lamda expression: " + fruits));


        System.out.println("\n====Linked List ====");

        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);
// => [frog, giraffe, buffalo, mongoose]

// Puts shark as the first element in the ArrayList
        animalList.addFirst("shark");
        System.out.println(animalList);
// => [shark, frog, giraffe, buffalo, mongoose]

// Puts koala as the last element in the ArrayList
        animalList.addLast("koala");
        System.out.println(animalList);
// => [shark, frog, giraffe, buffalo, mongoose, koala]

// This adds the value cuttlefish to the 3rd index of the LinkedList
        animalList.add(3, "cuttlefish");
        System.out.println(animalList);
// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]

        System.out.println("\n===== Queues====");
        Queue <Integer> myQueue= new LinkedList<>();

        // adds elements {5,6,7,8,9} to queue
        for(int i=5; i<10;i++){
            myQueue.add(i);
        }

        myQueue.add(12);

        System.out.println("Elements of queue: " + myQueue);

        int removedHead = myQueue.remove();
        System.out.println("removed element of myQueue: " + removedHead);

        System.out.println(myQueue);

        //To view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue: " + head);

        int size = myQueue.size();
        System.out.println("Size of the queue: " + size);

        System.out.println("\n==== Stacks ====");
//        Stack <Integer> myStack= new Stack<>();

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println(myStack);

//        Stack<Integer> myStack2 = new Stack<Integer>();
//        myStack2.push(1, 2, 3);

        //remove from a stack
        myStack.pop();
        System.out.println(myStack);

        // Queues : First In, First Out
        // Stack : Last in, first out

        int peek = myStack.peek();
        System.out.println(peek);

        boolean empty = myStack.empty();
        System.out.println(empty);






















    }

}
