public class DivideByZeroException extends Exception
{
    public DivideByZeroException()
    {
        super("DividingByZero");
    }
    public DivideByZeroException(String message)
    {
        super(message);
    }

}
