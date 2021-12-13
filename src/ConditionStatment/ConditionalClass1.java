package ConditionStatment;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class ConditionalClass1 {
    public static void main(String[] args) {
        int age=20;

        if (age>18) {
        System.out.println("Eligible For Application");
    }
        else
        {
            System.out.println(" Not Eligible For Application");
        }

        String city="BANGALORE";
        if (city=="BANGALORE") {
            System.out.println("Person Belong To AGRA");
        }
        else {
            System.out.println("Person Does not Belongs To AGRA");
        }
        if (age>=20 && city=="BANGALORE"){
            System.out.println("XYZ");




            }
                }

        }
