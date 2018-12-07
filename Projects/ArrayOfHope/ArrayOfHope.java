public class Tester
{
    public static void main(String args[])
    {
      for(int x = 65; x < 91; x++)
      {
          char ch[] = {(char) x};
          for(int y = 0; y < ch.length; y++)
          {
              System.out.print(ch[y] + ", ");
            }
        }
       
    }
}
