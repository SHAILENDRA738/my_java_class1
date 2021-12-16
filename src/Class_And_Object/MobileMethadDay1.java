package Class_And_Object;

public class MobileMethadDay1 {
    // data member
    String mobile_name;
    int prices;
    String app_name;

    //capabilities :  Open , Close

     /* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function or method :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
      */

    // Syntax : access_specifier return_type method_name (parameter ){ CODE }

    public void OpenMethod(){
        System.out.println(" This is Open Method");

    }

    public void CloseMethod(){
        System.out.println("This is Close ... Method");
    }


    public static void main(String[] args) {
        // How to Call Method ?
        // STEP 1- create Object :  ClassName ObjName= new ClassName();

        MobileMethadDay1 object= new MobileMethadDay1();

        // STEP 2 - object.methodName();
        object.OpenMethod();// Calling the ReadMethod

        object.CloseMethod();// calling write method

    }
}

