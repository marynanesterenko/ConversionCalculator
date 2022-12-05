package lenasFeatures;

public class TemperatureConversion {
 //   public static void main(String[] args) {
   //     System.out.println(calculateTemperature("F", "K", 0));
   // }
    public static double calculateTemperature(String type, String to, double amount) {
        if (type.equalsIgnoreCase("C") && to.equalsIgnoreCase("K")) {
            return amount + 273.15;

        } else if(type.equalsIgnoreCase("C") && to.equalsIgnoreCase("F")) {
            return amount + (9/5) + 32;
        } else if(type.equalsIgnoreCase("K") && to.equalsIgnoreCase("C")) {
            return amount - 273.15;
        }else if(type.equalsIgnoreCase("K") && to.equalsIgnoreCase("F")){
            return (amount - 273.15) * 9/5 + 32;
        } else if(type.equalsIgnoreCase("F") && to.equalsIgnoreCase("C")){
            return  (amount -32) * 5/9;
        }else if(type.equalsIgnoreCase("F") && to.equalsIgnoreCase("K")){
            return (amount -32) * 5/9 + 273.15;
        }
        return  -1;
    }
}

