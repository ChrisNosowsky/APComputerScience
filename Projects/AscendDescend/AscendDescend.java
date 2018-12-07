import java.util.Arrays;

public class Tester {
    public static void main(String args[])
    {
        String ss[] = {"Bill","Mary","Lee","Agnes","Alfred","Thomas","Alvin","Bernard","Ezra","Herman"};
        Arrays.sort(ss);
        System.out.println("Ascend" + "\t" + "Descend" + "\n");
        for(int x=0; x<ss.length;x++){
            int y = 9 - x;
                    System.out.println(ss[x] + "\t" + ss[y]);
        }
    }
}

