import exceptions.AccessDeniedException;
import exceptions.InsufficientAmountException;

public class Main {
    public static String accountName = "Gig";
    public static double amount = 100500.00d;

    public static void main(String[] args) throws InsufficientAmountException{
        System.out.println(deduct("Gig",10.00d));
        try {
            System.out.println(deduct("Giga", 10.00d));
        }
        catch (AccessDeniedException e) {
            System.out.println("Test passed");
        }
        catch (Exception e) {
            System.out.println("Test not passed");
        }
        try {
            System.out.println(deduct("Gig", 100501.00d));
        }
        catch (InsufficientAmountException e) {
            System.out.println("Test passed");
        }
        catch (Exception e) {
            System.out.println("Test not passed");
        }
    }

    public static double deduct(String accountToProcess, double amtToCacheOut) throws InsufficientAmountException {
        if(!accountName.equals(accountToProcess)) {
            throw new AccessDeniedException("NO ACCESS");
        }
        if (amount < amtToCacheOut)  {
            throw new InsufficientAmountException("Not enough money");
        }
        amount = amount - amtToCacheOut;
        return amount;
    }
}