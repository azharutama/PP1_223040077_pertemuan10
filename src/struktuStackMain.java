public class struktuStackMain {

  public static void main(String[] args) {
    strukturStack myStack = new strukturStack(3);
    strukturStack myStack2 = new strukturStack(3);




//Latihan 4

System.out.println("----sebelum push----");
System.out.println("size :" + myStack.size());
System.out.println("empty : "+myStack.isEmpty());
System.out.println("Full : "+myStack.isFull());
System.out.println("TOP "+ myStack.Top());

myStack.displayElement();

System.out.println();

System.out.println("----setelah push 3x----");

myStack.push(1);
myStack.push(2);
myStack.push(3);
System.out.println("size : "+myStack.size());
System.out.println("empty : "+myStack.isEmpty());
System.out.println("Full : "+myStack.isFull());
System.out.println("TOP "+ myStack.Top());

myStack.displayElement();

System.out.println();

//Tugas
System.out.println("----sebelum POP----");
myStack2.push(1);
myStack2.push(2);
myStack2.push(3);
System.out.println("size : "+myStack2.size());
System.out.println("empty : "+myStack2.isEmpty());
System.out.println("Full : "+myStack2.isFull());
System.out.println("TOP "+ myStack2.Top());


System.out.println();

System.out.println("----setelah POP----");

myStack2.pop();
System.out.println("size : "+myStack2.size());
System.out.println("empty : "+myStack2.isEmpty());
System.out.println("Full : "+myStack2.isFull());
System.out.println("TOP " + myStack2.Top());


System.out.println();

    
  }

  
}
