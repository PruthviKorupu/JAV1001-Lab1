// Pruthvi Sai Korupu
import java.util.*;

public class Convert
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); //declare sacnner class to take input
                double value; //declare double variable value
                String unit;  //declare string variable unit
                System.out.print("Enter the value to convert: ");
                value = sc.nextDouble(); //input value
                unit = sc.nextLine(); //imput unit

            if(unit.isEmpty()) { //if user not enter unit 
                    System.out.print("Enter the current unit of measure: ");
                    unit = sc.nextLine(); //input unit
                }
                
                
                //if unit is "km" or " km" because user can enter 10 km or first 10 and the after km
                if(unit.equals("km") || unit.equals(" km")) {
                    System.out.printf("%.2f km is equal to %.2fmi", value, value*0.62); //convert and print value
                    
                }else if(unit.equals("mi") || unit.equals(" mi")) {
                    
                     System.out.printf("%.2f mi is equal to %.2fkm", value, value*1.61);  //convert and print value
                     
                }else if(unit.equals("cm") || unit.equals(" cm")) {
                    
                     System.out.printf("%.2f cm is equal to %.2fin", value, value*0.39); //convert and print value
                     
                }else if(unit.equals("in") || unit.equals(" in")) {
                    
                     System.out.printf("%.2f in is equal to %.2fcm", value, value*2.54); //convert and print value
                     
                }else if(unit.equals("kg") || unit.equals(" kg")) {
                    
                     System.out.printf("%.2f kg is equal to %.2flb", value, value*2.2); //convert and print value
                     
                }else if(unit.equals("lb") || unit.equals(" lb")) {
                    
                     System.out.printf("%.2f lb is equal to %.2fkg", value, value*0.45); //convert and print value
                     
                }else if(unit.equals("g") || unit.equals(" g")) {
                    
                     System.out.printf("%.2f g is equal to %.2foz", value, value*0.04); //convert and print value
                     
                }else if(unit.equals("oz") || unit.equals(" oz")) {
                    
                     System.out.printf("%.2f oz is equal to %.2fg", value, value*28.35); //convert and print value
                     
                }else if(unit.equals("C") || unit.equals(" C")) {
                    
                     double farh = (value*(9.0/5.0)) + 32.0; //convert C to farheniet
                     System.out.printf("%.2f C is equal to %.2fF", value, farh);
                     
                }else if(unit.equals("F") || unit.equals(" F")) {
                       
                      double celci = (value-32.0)*(5.0/9.0); //convert F to celcius
                     System.out.printf("%.2f F is equal to %.2fC", value, celci);  //convert and print value
                     
                }else if(unit.equals("L") || unit.equals(" L")) {
                    
                     System.out.printf("%.2f L is equal to %.2fcups", value, value*4.17);  //convert and print value
                     
                }else if(unit.equals("cup") || unit.equals(" cup")) {
                    
                     System.out.printf("%.2f cuo is equal to %.2fL", value, value*0.24);  //convert and print value
                }else{
                    System.out.println("Invalid Unit!! Re-run the Program!!!");
                }
                
        }
}