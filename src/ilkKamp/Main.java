
package ilkKamp;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your birth: ");
//        System.out.println("Enter your birth: ");
//        int yearOfBirth;
//        yearOfBirth = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter your name :");
//        String name= scanner.nextLine();
//        int age= 2021-yearOfBirth;
//
//
//        if (age >=0 && age <= 100) {
//            System.out.println(" Your name is " + name + " and you are " + age + " years old");
//        }else System.out.println("Invalid Year of birth");
//
//    scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        int i = 1;
//        int number;
       // int sum = 0;



//        do {
//                System.out.println("Enter number #" + i + ":");
//            if (hasNextInt) {
//                number = scanner.nextInt();
//                sum += number;
//                i++;
//            } else {
//                System.out.println("Invalid Number");
//                scanner.close();
//                break;
//            }
//
//
//        }
//        while (i <= 10);
//        System.out.println(sum);

//        while (i <= 10) {
//            System.out.println("Enter number #" + i + ":");
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt) {
//                number = scanner.nextInt();
//                sum += number;
//                i++;
//            } else {
//                System.out.println("Invalid Number");
//                scanner.close();
//                break;
//            }
//        }
//        int sum=0;
//        int minNumber= Integer.MAX_VALUE;
//        int maxNumber=Integer.MIN_VALUE;
//        while (i==1) {
//            System.out.println("Enter number: ");
//            boolean hasNextInt = scanner.hasNextInt();
//
//            if (hasNextInt) {
//                number=scanner.nextInt();
//
//                if(minNumber>number) {
//                    minNumber=number;
//                }
//                if(maxNumber<number) {
//                    maxNumber=number;
//                }
//
//            }else {
//
//                System.out.println("Min Number= " + minNumber);
//                System.out.println("Max Number= " + maxNumber);
//                scanner.close();
//                break;
//
//            }
//        }

//        int j=0;
//        int counter=0;
//        int sum=0;
//        long avg=0;
//        while(j==0) {
//
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt) {
//                number=scanner.nextInt();
//                counter++;
//                sum+=number;
//                avg=(long)sum/counter;
//
//
//            }else {
//                System.out.println("Sum = " + sum );
//                System.out.println("AVG = " + avg );
//                scanner.close();
//                break;
//            }
//
//
//
//        }
        //ClassesConstractors.inputThenPrintSumAndAverage();
//        int bucketCount=ClassesConstractors.getBucketCount(3.4,2.1,1.5);
//        System.out.println(bucketCount);


        Car porsche = new Car();
        Car toyota = new Car();

        porsche.setModel("911");
        System.out.println("Model is " +porsche.getModel());

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println(calculator.getSubtractionResult());


       // BankAccount myAccount = new BankAccount("123456789", 400.00, "Erhan Ermişoğlu",
        //        "erhan.ermisoglu@defne.com.tr", "+90 555 255 33 36");
        BankAccount myAccount= new BankAccount();
        //operations.setBalance(200.67);
        myAccount.depositFunds(35.0);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawFunds(31.67);

        BankAccount ErhansAccount =new BankAccount("Erhan", "erhan@erhan.com", "555 255 33 36");
        System.out.println(ErhansAccount.getPhoneNumber() + " name " + ErhansAccount.getCustomerName() + " Balance: "+ ErhansAccount.getBalance());

        VipCustomer vipErhan= new VipCustomer();
        System.out.println("Credit Limit: " + vipErhan.getCreditLimit() + " Name: " + vipErhan.getName() +" Email: " + vipErhan.getEmail() );


        Point first = new Point(7, 5);
        Point second = new Point(3, 1);

        System.out.println(second.getX());

        System.out.println(first.distance(second));

       // Floor floor = new Floor(3.2, 4.5);
       // System.out.println(floor.getArea());


            Carpet carpet = new Carpet(3.5);
    Floor floor = new Floor(2.75, 4.0);
    Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
    carpet = new Carpet(1.5);
    floor = new Floor(5.4, 4.5);
    calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());

    }

}
