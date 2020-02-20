package ie.gmit;

public class Counter {
    private int count;

    public Counter(int starting_from){
        if(starting_from<0)
            throw  new IllegalArgumentException("must be greater than 0");
        else
            this.count = starting_from;

    }


    public Counter() {
        this.count = 0;
    }


    public int getCount()
    {
        return count;
    }

    public int Increment()
    {
        count++;

        return count;
    }

    public int Decrement()
    {
        count--;

        return count;
    }

    public int Multiply(int a,int b)
    {
        return a*b;
    }

    public int Divide(int a,int b)
    {
        if(b==0){
            throw  new IllegalArgumentException("cannot divide by 0");
        }
        else {
            return a/b;
        }
    }
}
