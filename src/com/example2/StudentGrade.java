package com.example2;

import java.util.Scanner;

public class StudentGrade {
	// Input: Take marks obtained (out of 100) in each subject.
//	 Calculate Total Marks: Sum up the marks obtained in all subjects.
//	 Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
//	 average percentage.
//	 Grade Calculation: Assign grades based on the average percentage achieved.
//	 Display Results: Show the total marks, average percentage, and the corresponding grade to the user

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Taking input for the number of subjects
		System.out.println("Enter the marks of Marathi(out of 100): ");
		float s1 = s.nextFloat();
		System.out.println("Enter the marks of English(out of 100): ");
		float s2 = s.nextFloat();
		System.out.println("Enter the marks of Mathematics(out of 100): ");
		float s3 = s.nextFloat();
		System.out.println("Enter the marks of History(out of 100): ");
		float s4 = s.nextFloat();
		System.out.println("Enter the marks of Geography(out of 100): ");
		float s5 = s.nextFloat();
		System.out.println("Enter the marks of Science(out of 100): ");
		float s6 = s.nextFloat();
		
		float totalMarks = (s1 + s2 + s3 + s4 + s5 + s6);
		float averagePercentage = totalMarks /6;
		
		// Calculating the grade
		char grade;
		if (averagePercentage >= 90) {
			grade = 'A';
		} else if (averagePercentage >= 80) {
			grade = 'B';
		} else if (averagePercentage >= 70) {
			grade = 'C';
		} else if (averagePercentage >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		// Format the average percentage to 2 decimal places
        String formattedAvPer = String.format("%.2f", averagePercentage);

		// Displaying the results
		System.out.println("Total Marks:" + totalMarks);
		System.out.println("Average Percentage:" + formattedAvPer + "%");
	    System.out.println("Grade:" + grade);

		s.close();
	}
}
