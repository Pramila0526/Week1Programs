package com.bridgelabz.fellowshipprogramss.datastructure;

public class StackLinkedList<T> {
private MyNode<T>top;
private int size;

//Constuctor
public StackLinkedList()
{
top=null;
size=0;
}
/**
* Purpose : Funtion to ckeck is Stack is Empty
* @return : Return the top value
*/
public boolean isStackEmpty()
{
return top==null;
}
public int getsize()
{
return size;
}
/**
* Purpose : data the item which needs to push in stack
* @param : Passing data as an argument
*/
@SuppressWarnings("unused")
public void push(T data)
{
MyNode <T>temp=new MyNode<>(data,null);
if(temp==null)
{
top=temp;
}
else
{
temp.setNextRef(temp);
top=temp;
}
size++;
}
/**
* purpose : data the item which needs to pop in stack
* @return : return the first value inserted or null if stack is empty
*/
public T pop()
{
if(isStackEmpty())
{
System.out.println("No Element");
return null;
}
MyNode<T>temp=top;
top=temp.getNextRef();
size--;
return temp.getValue();
}
}
