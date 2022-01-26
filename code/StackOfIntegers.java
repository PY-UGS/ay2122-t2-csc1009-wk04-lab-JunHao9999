import java.util.Scanner;

public class StackOfIntegers {
    private int elements[];
    private int size;

    //constructors
    //construct an empty stack with a default capacity of 16
    public StackOfIntegers(){
        elements=new int[16];
    }
    //construct an empty stack with a specified capacity
    public StackOfIntegers(int size){
        elements=new int[size];
    }

    //setters and getters
    public int[] getElements(){
        return elements;
    }
    public void setElements(){
        this.elements=elements;
    }
    public int getSize(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int overwrite_int=Integer.parseInt(sc.nextLine());
//        System.out.println("overwritten_int= "+overwrite_int);
        return overwrite_int;
    }
    public void setSize(){
        this.size=size;
    }

    //methods
    //return true if stack is empty
    //if size=0 return true, else if size >0 return false <<try>>
    public boolean empty(){
        if (this.size==0)
            return true;
        else
            return false;
    }
//
//    //overwrite the size?? then use the size top peek and pop.
    public int peek(){
        return elements[size];
    }
//if len(element)=size
    public void push(int val){
        if (elements.length==this.size+1) {
            System.out.println("Exceeed stack size");
            return;
        }
        ++this.size;
        this.elements[this.size]=val;

    }

    public int pop(){
        if (this.size==-1){
            System.out.println("Nothing to pop, whatchu doing");
            return 0;
        }
        int temp=this.elements[this.size];
        --this.size;
        return temp;
    }

}
