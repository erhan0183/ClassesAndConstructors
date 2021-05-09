package ilkKamp;

import java.util.Scanner;

public class ClassesConstractors {

    public static void inputThenPrintSumAndAverage() {
        int j=0;
        int counter=0;
        int sum=0;
        long avg=0;
        Scanner scanner = new Scanner(System.in);
        while(j==0) {

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number=scanner.nextInt();
                counter++;
                sum+=number;
                avg=Math.round((double)sum/counter);


            }else {
                System.out.print("SUM = " + sum );
                System.out.println(" AVG = " + avg );
                scanner.close();
                break;
            }

        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket ) {
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBucket<0 )
            return -1;

        double area = width*height;
        double requiredBucket= Math.ceil((double)(area/areaPerBucket));
        return (int)requiredBucket-extraBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width<=0 || height<=0 || areaPerBucket<=0 )
            return -1;

        double area = width*height;
        double requiredBucket= Math.ceil((double)(area/areaPerBucket));
        return (int)requiredBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area<=0 || areaPerBucket<=0 )
            return -1;


        double requiredBucket= Math.ceil((double)(area/areaPerBucket));
        return (int)requiredBucket;
    }

}
