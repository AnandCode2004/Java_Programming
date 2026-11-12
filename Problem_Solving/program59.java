import java.util.Scanner;

class Iteration
{
    public void Display(int iNo)
    {   
        if (iNo <= 0)
        {
           iNo = -iNo;
        }

        int iCnt = 0;
            //1        //2         //4
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh....");//3
        }
    }
}

class program59
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the  frequency : ");
        iValue = scanner.nextInt();

        Iteration  iteration = new Iteration();
        iteration.Display(iValue);

           scanner.close();
    }
}