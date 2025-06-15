public class Ternary_Operator 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int result = 0;
// this is the odd even conditional statement below
    /*  if(n%2==0)
            result = 10;          
        else
            result = 20; 
    */

        // ?: = Ternary Operator

        result = n%2==0 ? 10 : 20;

        System.out.println(result);
    }
    
}
