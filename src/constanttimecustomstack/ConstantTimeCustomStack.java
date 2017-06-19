/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constanttimecustomstack;
import java.util.Stack;
/**
 *
 * @author sansari
 */
public class ConstantTimeCustomStack <E extends Comparable<E>>{

    /**
     * @param args the command line arguments
     */
    Stack<E> regularStack = new Stack<>();
    Stack<E> minStack = new Stack<>();
    public ConstantTimeCustomStack(){
        
    }
    public void AddElement(E item) throws Exception
    {
        regularStack.push(item);
        //System.out.println("Adding"+ minStack.peek().toString());
        if (minStack.isEmpty() || minStack.peek().compareTo(item) > 0){
            minStack.push(item);
        }
    }
    public E GetMin(){
    return minStack.peek();
    }
    public E RemoveLastElement(){
        E removedElement = regularStack.pop();
        if (!minStack.isEmpty()&& removedElement.compareTo(GetMin())==0)
        {
            minStack.pop();
            //System.out.println("removing the last element");
        }
        return removedElement;
    }
    public E GetLastElement()throws Exception {
    return regularStack.peek();
    }
    public static void main(String[] args) throws Exception{
        ConstantTimeCustomStack<Item> minStack = new ConstantTimeCustomStack<>();
        minStack.AddElement(new Item("Shahin", 20));
        minStack.AddElement(new Item("Ali", 10));
        minStack.AddElement(new Item("Vali", 34));
        minStack.AddElement(new Item("Taghi", 2));
        minStack.AddElement(new Item("Naghi", 44));
        minStack.AddElement(new Item("Baagher", 1));
        minStack.AddElement(new Item("Hasan", 100));
        System.out.println("Expected 1, Actual" + minStack.GetMin().id);
        System.out.println("Removing the last element:"+minStack.RemoveLastElement().id);
        System.out.println("Removing the last element:"+minStack.RemoveLastElement().id);
        System.out.println("Expected 2, Actual "+ minStack.GetMin().id);
        System.out.println("Get the last element"+minStack.GetLastElement().id);
        System.out.println("Get the last element"+minStack.GetLastElement().id);
        System.out.println("Removing the last element:"+minStack.RemoveLastElement().id);
        System.out.println("Removing the last element:"+minStack.RemoveLastElement().id);
        System.out.println("Expected 10, Actual "+ minStack.GetMin().id);
    }
    
}
