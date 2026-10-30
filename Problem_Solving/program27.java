import java.util.Scanner;
class program27

{
    public static void main(String arg[])
    {
       Scanner scanner = new Scanner(System.in);

       String sname = null;
       int iAge = 0;
       float fMarks = 0.0f;
       
       System.out.println("Enter your name: ");
       sname = scanner.nextLine();

       System.out.println("Enter your age: ");
       iAge = scanner.nextInt();

       System.out.println("Enter your marks: ");
       fMarks = scanner.nextFloat();


        System.out.println("My name is " + sname);
        System.out.println("And i am "+ iAge + " years old");
        System.out.println("and i got "+ fMarks + "marks in Maths.");

       

    }
}