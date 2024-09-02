package June2024.ExceptionHandling.MultiCatch;

public class CatchPipeline {
    int m1(){
        try {
            System.out.println("In try block");
            int a = 10/0;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[5]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){        // it is a replacement of multi catch blocks
            //this is the way of creating a catch block pipeline
            System.out.println(e);
        }
        return 10;
    }
    public static void main(String[] args){
        CatchPipeline c = new CatchPipeline();
        System.out.println(c.m1());
    }
}
