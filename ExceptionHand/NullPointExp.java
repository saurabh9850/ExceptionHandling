package ExceptionHand;

public class NullPointExp {
  public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access a method on a null object!");
        }

        System.out.println("our next code can run hence proved");
    }

}
