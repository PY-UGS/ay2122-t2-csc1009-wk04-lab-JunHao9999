public class StackOfIntegersMain {
    public static void main(String[] args) {
        StackOfIntegers st=new StackOfIntegers();
        for (int i=0;i<10;i++)
            st.push(i);

        System.out.println("peek: "+st.peek());
        while(!st.empty())
            System.out.print(st.pop()+" ");
    }
}
