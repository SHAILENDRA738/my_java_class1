package Class_And_Object;

public class MobileParamConstructor {

    String name;
    int prices;
    int ram;

    public MobileParamConstructor(String name, int prices, int ram) {
        this.name = name;
        this.prices = prices;
        this.ram = ram;
    }

    public static void main(String[] args) {
        MobileParamConstructor object=new MobileParamConstructor("samsung",25000,8);


        System.out.println(object.name);
        System.out.println(object.prices);
        System.out.println(object.ram);
        MobileParamConstructor object1=new MobileParamConstructor("oppo",20000,6);
        System.out.println(object1.name);
        System.out.println(object1.prices);
        System.out.println(object1.ram);

        }
    }


