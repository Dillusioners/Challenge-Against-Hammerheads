/**
 * Author :- jayspray
 * Team :- Dillusioners
 * Program Word :- teeth
 * This program inputs your teeth in 1 half of 1 jaw and checks if you are normal or abnormal
 */
import java.util.*;
public class teeth {
    public static void patientCase(int a){
        //Pretty simple method to check abnormality with the help of the dental formula
        Scanner sc = new Scanner(System.in);
        String[] tooth = {"Incisors","Canines","Premolars","Molars"};
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Please enter number of teeth in each jaw as follows : incisors,canines,premolars,molars");
        for(int i=0;i<4;i++){
            int teethNum = sc.nextInt();
            map.put(tooth[i],teethNum);
        }
        //For infants
        if(a <= 2){
            if(map.get(tooth[0]) != 2 || map.get(tooth[1]) != 1 || map.get(tooth[2]) != 0 || map.get(tooth[3]) != 2)
                System.out.println("Abnormal");
            else
                System.out.println("Normal Case");
            
        }
        //For adolescents
        else if(a > 2 && a <= 20){
            if(map.get(tooth[0]) != 2 || map.get(tooth[1]) != 1 || map.get(tooth[2]) != 2 || map.get(tooth[3]) != 2)
                System.out.println("Abnormal");
            else
                System.out.println("Normal Case");
            
        }
        //For adults
        else{
            if(map.get(tooth[0]) != 2 || map.get(tooth[1]) != 1 || map.get(tooth[2]) != 2 || map.get(tooth[3]) != 2)
                System.out.println("Abnormal");
            else
                System.out.println("Normal Case");
        }
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to the Dentist ");
        int age;
        //Putting restrictions on age
        while(true){
            System.out.println("Please enter your age: ");
            age = sc.nextInt();
            if(age > 0 && age <= 120){
                System.out.println("OK");
                break;
            }
            else
                System.out.println("Please enter practical ages of a human being!");

        }
        //Invoking method
        patientCase(age);
        sc.close();

    }
}
