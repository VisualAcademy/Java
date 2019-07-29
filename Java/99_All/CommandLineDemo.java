public class CommandLineDemo
{
    // Command Line Argument 
    public static void main(String[] args)
    {
        int first = Integer.parseInt(args[0]); // 1
        int second = Integer.parseInt(args[1]); // 2
        System.out.println(first + second); // 1 + 2 = 3
    }
}
