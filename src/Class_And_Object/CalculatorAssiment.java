package Class_And_Object;

public class CalculatorAssiment {

     public int addition() {
         int a = 6;
         int b = 4;
         int result = a + b;
         System.out.println("addition of a and b is :" + result);
         return result;
     }
        public int subtration(){
        int a=6;
        int b=4;
        int result=a-b;
        System.out.println("subtration of a and b is :"+result);
         return  result;

        }
        public int multi(){
         int a=6;
         int b=4;
         int result=a-b;

            System.out.println(" multi of a and b is :"+result);

            return result;
        }
        public void divide(){
         int a=6;
         int b=4;
         int result=a/b;
            System.out.println("divide of a and b :"+result);
        }
        public static void main(String[] args) {


        CalculatorAssiment obj = new CalculatorAssiment();
        int result = obj.addition();
        System.out.println("addition is :"+result);

         obj.subtration();
         obj.multi();
         obj.divide();

    }
}






