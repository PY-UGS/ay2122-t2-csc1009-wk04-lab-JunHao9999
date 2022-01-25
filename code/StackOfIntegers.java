public class StackOfIntegers {
    private int elements[];
    private int size;
    private int top=-1;

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
        return size;
    }
    public void setSize(){
        this.size=size;
    }

    //methods
    //return true if stack is empty
    public boolean empty(){
        if (this.top==-1)
            return true;
        else
            return false;
    }

    public int peek(){
        return elements[top];
    }

    public void push(int val){
        this.top+=1;
        this.elements[this.top]=val;

    }

    public int pop(){
        int temp=this.elements[this.top];
        this.top-=1;
        return temp;
    }

}
