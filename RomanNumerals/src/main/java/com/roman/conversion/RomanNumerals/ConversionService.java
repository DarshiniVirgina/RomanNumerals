package com.roman.conversion.RomanNumerals;
import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {

    public void digitsToNumerals(){
    System.out.println("Enter the digit:");   
    Scanner sc = new Scanner(System.in);
    int digit = sc.nextInt();
    if(digit<=0){
        System.out.println("Invalid Numerals");  
    }else{
        System.out.println("Roman Numeral:"); 
    }
    while(digit>0){
       
        if(digit>=1000){
            System.out.print("M");
            digit = digit - 1000;
        }else if(digit>=900){
            System.out.print("CM");
            digit = digit - 900;
        }
        else if(digit>=700){
            System.out.print("DCC");
            digit = digit - 700;
        } else if(digit>=400){
            System.out.print("CD");
            digit = digit - 400;
        }
        else if(digit>=100){
            System.out.print("C");
            digit = digit - 100;
        }
        else if(digit>=90){
            System.out.print("XC");
            digit = digit - 90;
        }
        else if(digit>=10){
            System.out.print("IX");
            digit = digit - 10;
        }
        else if(digit>=9){
            System.out.print("IX");
            digit = digit - 9;
        }
        else if(digit>=7){
            System.out.print("VII");
            digit = digit - 7;
        }
        else if(digit>=4){
            System.out.print("IV");
            digit = digit - 4;
        }
        else if(digit>=3){
            System.out.print("III");
            digit = digit - 3;
        }
        else if(digit>=1){
            System.out.print("I");
            digit = digit - 1;
        }
       
    }
    
sc.close();
	
    }


    public void numeralsToDigits(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a roman number: ");
        String roman = sc.nextLine();
        switch (roman) 
        {
            case "I":
            case "i":
            System.out.print("1");
            break;
            case "IV":
            case "iv":
            System.out.print("4");
            break;
            case "IX":
            case "ix":
            System.out.print("9");
            break;
            case "XC":
            case "xc":
            System.out.print("90");
            break;
            case "CM":
            case "cm":
            System.out.print("900");
            break;
            case "MCMIII":
            case "mcmiii":
            System.out.print("1903");
            break;
            case "MCMXCVII":
            case "mcmxcvii":
            System.out.print("1997");
            break;
            case "MMMM":
            case "mmmm":
            System.out.print("4000");
            break;
        }
        sc.close();

    }
    
}
