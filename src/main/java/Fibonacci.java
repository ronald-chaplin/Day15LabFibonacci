public class Fibonacci {

    public Fibonacci(){ }

    static long fib(int n)
    {
        if(n <= 8 || n > 50)
        {
            System.out.println("Number of times to run must be greater than 8 and less than or equal to 50");
            return -1l;
        }

        long[] f = new long[n+2];

        for (int i = 0; i <= n; i++)
        {
            if(i == 0)
                f[0] = 0;
            else if (i == 1)
                f[1] = 1;
            else
                f[i] = f[i-1] + f[i-2];

            System.out.println("F"+i +" -> "+ f[i]);
        }

        return f[n];
    }
}
