import java.util.Scanner;

public class Main

    {
        public static void main(String[] args)
        {
            try
            {
                System.out.println("Enter number of widgets");
                Scanner keyboard = new Scanner(System.in);
                int widgets = keyboard.nextInt();
                if(widgets < 0)
                    throw new NegativeNumberException("widgets");

                System.out.println("how many defectives");
                int defective = keyboard.nextInt();
                if(defective < 0)
                    throw new NegativeNumberException("defectives " + " widgets");
                double ratio = exceptionDivision(widgets, defective);

                System.out.println("one is every: " + ratio + "  widgets is defective");

            }
            catch (DivideByZeroException e)
            {
                System.out.println("Congrationals a perfect record");
            }
            catch (NegativeNumberException e)
            {
                System.out.println("Can not have a negative number of: " + e.getMessage());
            }

        }



    public static double exceptionDivision(double nominator, double denominaotor) throws DivideByZeroException
    {
        if(denominaotor == 0)
            throw new DivideByZeroException();

        return nominator/denominaotor;

    }
}
