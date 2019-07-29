public class DataTypeNumber
{
    public static void main(String[] args)
    {
        System.out.println("[08비트] byte:  \t" +    Byte.MIN_VALUE + "~" +    Byte.MAX_VALUE);        
        System.out.println("[16비트] short: \t" +   Short.MIN_VALUE + "~" +   Short.MAX_VALUE);        
        System.out.println("[32비트] int:   \t" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);        
        System.out.println("[64비트] long:  \t" +    Long.MIN_VALUE + "~" +    Long.MAX_VALUE);        
    }    
}

// [08비트] byte:          -128~127
// [16비트] short:         -32768~32767
// [32비트] int:           -2147483648~2147483647
// [64비트] long:          -9223372036854775808~9223372036854775807
