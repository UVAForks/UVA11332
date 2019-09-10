import java.util.*;//Time limit
public class Main
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String str = sc.next();
            String zero = "0";
            String two = "2";
            if(str.equals(zero))
            {
                break;
            }
            if(str.equals(two))
            {
                System.out.print("2");
            }
            char[] c = str.toCharArray();
            int point = fib(c);
            while(point > 2)
            {
                point = fib(change(point));
            }
            System.out.print(point);

        }
    }
    public static int fib(char[] c)
    {
        int temp = 0;
        for (int i = 0; i < 10; i++)
        {
            temp += c[i] - '0';
        }
        return temp;
    }
    public static char[] change(int ans)
    {
        String str1 = String.valueOf(ans);
        char chars[] = str1.toCharArray();
        return chars;
    }
}
