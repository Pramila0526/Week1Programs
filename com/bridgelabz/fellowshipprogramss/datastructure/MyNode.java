package com.bridgelabz.fellowshipprogramss.datastructure;

public class MyNode<T> {
private T value;
private MyNode<T>nextRef;

public MyNode()
{
value=null;
nextRef=null;
}
public MyNode(T data, MyNode<T>next)
{
this.value=data;
this.nextRef=next;

}
public T getValue() {
return value;
}
public void setValue(T value) {
this.value = value;
}
public MyNode<T> getNextRef() {
return nextRef;
}
public void setNextRef(MyNode<T> nextRef) {
this.nextRef = nextRef;
}

}










