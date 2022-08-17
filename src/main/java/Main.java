import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //ACCOUNT
        Account account1 = new Account("#1996", "Mike",1337);
        System.out.println(account1);
        System.out.println(account1.getId());
        System.out.println("Name : " + account1.getName());
        System.out.println("Balance : £" + account1.getBalance());

        //CIRCLE
        Circle testCircle = new Circle(13); //

        System.out.println("- CIRCLE -");
        System.out.println("RADIUS : " + testCircle.getRadius());
        System.out.println("CIRCUMFERENCE : " + testCircle.getCircumference());

        testCircle.setRadius(30);

        System.out.println("- NEW CIRCLE -");
        System.out.println("RADIUS : " + testCircle.getRadius());
        System.out.println("CIRCUMFERENCE : " + testCircle.getCircumference());

        //RECTANGLE
        Rectangle myRectangle = new Rectangle(10, 12);

        System.out.println("- RECTANGLE -");
        System.out.println("PERIMETER :"+myRectangle.getPerimeter());
        System.out.println("AREA : "+myRectangle.getArea());
        System.out.println("DIAGONAL : "+myRectangle.getDiagonal());


        // CUSTOMER
        Customer greg = new Customer("Greg", "Roll", 100);

        System.out.println("CUSTOMER NAME: " + greg.getFullName());
        System.out.println("CUSTOMER HELD MONEY: " + greg.getHeldMoney());

        greg.subtractHeldMoney(20);
        System.out.println("HELD MONEY AFTER SUBTRACTION: " + greg.getHeldMoney());

        Account gregAccount = new Account("1", "Greg", 500);

        System.out.println(gregAccount.toString());
    }
}
