package com.test.grades;

import java.util.Scanner;

public class STUDENTGRADES {   
     public static void main(String[] args) {
    String studentName;
    String grade;
    String [] subjects = new String[5];
    int[] scores = new int[5];
   
    
    			//Request the user for the student name
                Scanner in = new Scanner (System.in);
                System.out.println( "Type in the Student name:");
                studentName = in.next();
                studentName = studentName+" "+in.nextLine();
                //Request user for subject names
                System.out.println( "Type in the Subject names:");
                subjects[0] = in.next();
                subjects[1] = in.next();
                subjects[2] = in.next();
                subjects[3] =  in.next();
                subjects[4] =  in.next();
                System.out.println( "Type in the Score:");
                scores[0]= in.nextInt();
                scores[1]= in.nextInt();
                scores[2]= in.nextInt();
                scores[3]= in.nextInt();
                scores[4]= in.nextInt();
                
                System.out.println("Your grades are being processed....");
                System.out.println("Student Name : " + studentName);
                for(int i=0;i<scores.length;i++) {
                	printGrade(scores[i],subjects[i],studentName);
                	
                }
            
         
	}
     
     
     public static void printGrade(int score,String subject,String studentName) {
    	
    	 if (score >= 70) {
    		System.out.println (subject + ": Grade A. Well done!!");	
    		}
    		else if (score >= 60 && score <=69){
    			System.out.println(subject + ": Grade B. Good. ");
    		}
    		else if (score >= 50 && score <= 59){
    			System.out.println (subject + ": Grade C. Average. ");		
    		}
    		else if (score >= 40 && score <=49){
    			System.out.println  (subject + ": Grade D. Retake Course.");
    		}
    		else if (score <= 40) {
    			System.out.println  (subject + ": Grade F. Retake Course.");	
    		}
    		else 
    			
    			System.out.println  ("Invalid Grade for " + subject);
    	         
    	 
     }
    }
