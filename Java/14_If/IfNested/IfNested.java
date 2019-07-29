// 중첩 된 if 문 
public class IfNested
{
    public static void main(String[] args)
    {
        String name = "Java";
        int version = 2017;

        if (name == "Java")
        {
            if (version == 2017)
            {
                  System.out.printf("%s %d\n", name, version); 
            }
        }
    }
}
