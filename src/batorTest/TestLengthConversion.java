package batorTest;

import java.util.Scanner;

/*Acceptance criteria:
        GIVEN that I need to convert 1 meter into kilometer, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
        and "kilometer" in the "To" listbox, THEN I should get 0.001  in the output textbox.
        GIVEN that I need to convert 1 meter into centimeter, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
         and "centimeter" in the "To" listbox, THEN I should get 100  in the output textbox.
        GIVEN that I need to convert 1 meter into millimeter, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
        and "millimeter" in the "To" listbox, THEN I should get 1000 in the output textbox.
        GIVEN that I need to convert 1 meter into micrometer, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
        and "micrometer" in the "To" listbox, THEN I should get 1000000 in the output textbox.
        GIVEN that I need to convert 1 meter into nanometer, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
         and "nanometer" in the "To" listbox, THEN I should get 1000000000 in the output textbox.
        GIVEN that I need to convert 1 meter into mile, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
        and "mile" in the "To" listbox, THEN I should get 0.0006213689 in the output textbox.
        GIVEN that I need to convert 1 meter into yard, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
        and "yard" in the "To" listbox, THEN I should get 1.0936132983 in the output textbox.
        GIVEN that I need to convert 1 meter into foot, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
         and "foot" in the "To" listbox, THEN I should get 3.280839895 in the output textbox.
        GIVEN that I need to convert 1 meter into inch, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
        and "inch" in the "To" listbox, THEN I should get 39.37007874 in the output textbox.
        GIVEN that I need to convert 1 meter into light year, WHEN I enter 1 into an input textbox AND select the meter in the "From" listbox
         and "light year" in the "To" listbox, THEN I should get 1.057008707E-16 in the output textbox.
*/
public class TestLengthConversion {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length meters");
        long meter = sc.nextInt();
        double centimeter,km, millimeter,micrometer,nanometer,mile,yard,foot,inch,light_year;
        System.out.println("Please enter your value: ");
        String operation = sc.next();

        switch (operation.toLowerCase()){
            case "kilometer":
                km = meter * 0.001;
                System.out.println("Length in Kilometer ="+km+" km");
                break;

            case "centimeter":
                centimeter=meter * 100.0;
                System.out.println("Length in Centimeter = " + centimeter + " cm ");
                break;

            case "millimeter":
                millimeter=meter * 1000.0;
                System.out.println("Length in millimeter ="+millimeter+" ml");
                break;

            case "micrometer":
                micrometer=meter * 1000000.0;
                System.out.println("Length in micrometer ="+micrometer+" micrometer");
                break;

            case "nanometer":
                nanometer=meter * 1000000000.0;
                System.out.println("Length in nanometer ="+nanometer+" nanometer");
                break;

            case "mile":
                mile=meter * 0.0006213689;
                System.out.println("Length in mile ="+mile+" mile");
                break;

            case "yard":
                yard=meter * 1.0936132983;
                System.out.println("Length in yard ="+yard+" yard");
                break;

            case "foot":
                foot=meter * 3.280839895;
                System.out.println("Length in foot ="+foot+" foot");
                break;

            case "inch":
                inch=meter * 39.37007874;
                System.out.println("Length in inch ="+inch+" inch");
                break;

            case "light year":
                light_year=meter * 1.057008707E-16;
                System.out.println("Length in light year ="+light_year+" light year");
                break;

            default:
                System.out.println("Please choose from the list");
        }
    }
}