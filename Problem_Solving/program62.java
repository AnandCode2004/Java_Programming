import java.util.Scanner;
class Iteration 
{
      public void Display(int iNo) 
      {
          int iCnt = 0;

        for (iCnt = 1 ; iCnt <= iNo ; iCnt++)
        { 
            System.out.println("--------------");
            System.out.println(iCnt + " Jay Ganesh...");
            // printf("%d Jay ganesh...\n" ,iCnt) in C
            System.out.println("--------------");

        }
    } 
}

class program62
{
    
    public static void main(String[] args)
    {
        Scanner scanner = null;
        scanner = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frequency");
        iValue = scanner.nextInt();

        Iteration iteration = new Iteration();
        iteration.Display(iValue);

           scanner.close();
    }    

}