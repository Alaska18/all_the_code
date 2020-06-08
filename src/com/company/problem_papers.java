import java.util.Scanner;

public class Main {
    static double sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int i;
        for(i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(canBuild(array));

    }
    public static String canBuild(int[] array)
    {

        int size = array.length;
        if(array[0] > 0)
            return "Possible";
        int i;
        double areaf = 1;
        double requiredArea = 0;
        for(i = 1; i < size; i++)
        {
            areaf = areaf*0.5;
            if(array[i]*areaf >= 1.0000)
                return "Possible";
            if(array[i] > 0)
            {
                if(array[i] < (1 - requiredArea)/areaf) {
                    requiredArea += (array[i]) * areaf;
                    System.out.println(requiredArea);
                }
                else return "Possible";
            }

        }
        return "Impossible";


    }


}
