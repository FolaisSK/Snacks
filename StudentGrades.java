import java.util.Scanner;
import java.util.Arrays;

public class StudentGrades{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("How many students in the class? ");
		int noOfStudents = input.nextInt();

		System.out.print("How many subjects offered by each student? ");
		int noOfSubjects = input.nextInt();

		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully\n");

		int[][] studentGrades = new int[noOfStudents][noOfSubjects];

		int studentCounter = 1;
		int subjectCounter = 1;

		for(int row = 0; row < noOfStudents; row++){

			for(int column = 0; column < noOfSubjects; column++){

				System.out.println("Entering Score for Student " + studentCounter);
				System.out.println("Enter Score for Subject " + subjectCounter);
				
				int score = input.nextInt();

				while(score >= 0 && score <= 100){

					studentGrades[row][column] = score;
				
					System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully\n");

					subjectCounter++;
					break;

				}
			}

			studentCounter++;
			subjectCounter = 1;
		}

		

		String line = "============================================================";

		System.out.println(line);
		System.out.print("STUDENT	\t");

		for(int count = 1; count <= noOfSubjects; count++){

			System.out.print("SUB" + count + "\t");
		}

		System.out.println("TOT\t AVE\t POS");

		System.out.println(line);
		studentCounter = 1;

		for(int row = 0; row < noOfStudents; row++){

			System.out.print("Student " + studentCounter + "\t");

			for(int column = 0; column < noOfSubjects; column++){

				System.out.print(studentGrades[row][column] + "\t");

			}

			System.out.print(totalOfScores(studentGrades)[row]+ "\t" + averageOfScores(studentGrades)[row] + "\t" + positionOfStudents(studentGrades)[row] + "\n");

			studentCounter++;
		}

		System.out.println(line);
		System.out.println(line + "\n");



		System.out.println("SUBJECT SUMMARY");

		for(int subject = 0; subject < noOfSubjects; subject++){

			System.out.println("Subject " + subjectCounter);
			
			System.out.println("Highest Scoring Student is: Student " + highestStudent(studentGrades)[subject] + " scoring " + highestStudentScore(studentGrades)[subject]);

			System.out.println("Lowest Scoring Student is: Student " + lowestStudent(studentGrades)[subject] + " scoring " + lowestStudentScore(studentGrades)[subject]);

			System.out.println("Total Score is: " + totalScoresOfSubjects(studentGrades)[subject]);

			System.out.println("Average Score is: " + averageOfSubjects(studentGrades)[subject]);

			System.out.println("Number of Passes: " + numberOfSubjectPasses(studentGrades)[subject]);

			System.out.println("Number of Fails: " + numberOfSubjectFailures(studentGrades)[subject]);
			System.out.println();

			subjectCounter++;

		}

		System.out.println();

		System.out.println("The hardest subject is Subject " + hardestSubject(studentGrades) + " with " + hardestSubjectFailures(studentGrades) + " failures");

		System.out.println("The easiest subject is Subject " + easiestSubject(studentGrades) + " with " + easiestSubjectPasses(studentGrades) + " passes");

		System.out.println("The overall Highest score is scored by Student " + overallHighestScoringStudent(studentGrades) + " in subject " + overallHighestScoredSubject(studentGrades) + " scoring " + overallHighestScore(studentGrades));

		System.out.println("The overall Lowest score is scored by Student " + overallLowestScoringStudent(studentGrades) + " in subject " + overallLowestScoredSubject(studentGrades) + " scoring " + overallLowestScore(studentGrades));

		System.out.println(line + "\n\n");

		System.out.println("CLASS SUMMARY");

		System.out.println(line);

		System.out.println("Best Graduating Student is: Student " + bestGradStudent(studentGrades) + " scoring " + bestGradTotal(studentGrades));

		System.out.println(line + "\n\n");

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		System.out.println("Worst Graduating Student is: Student " + worstGradStudent(studentGrades) + " scoring " + worstGradTotal(studentGrades));

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n");

		System.out.println(line);

		System.out.println("Class total score is: " + classTotalScore(studentGrades));
		System.out.println("Class average score is: " + classAverageScore(studentGrades));

		System.out.println(line);	


	}




	//Total of Each Students Scores
	public static int[] totalOfScores(int[][] arr){
	
		int[] total = new int[arr.length];
		int sum = 0;

		for(int row = 0; row < arr.length; row++){

			for(int column = 0; column < arr[row].length; column++){

				sum += arr[row][column];
			}

			total[row] = sum;
			sum = 0;

		}

		return total;
	}


	//Average of Each Students Scores
	public static double[] averageOfScores(int[][] arr){

		double [] averages = new double[arr.length];
		int[] total = totalOfScores(arr);

		for(int count = 0; count < arr.length; count++){

			averages[count] = total[count] / arr[1].length;

		}

		return averages;
	}



	//Position of Each Student Based on Totals
	public static int[] positionOfStudents(int[][] arr){

		int[] totalsOfStudents = totalOfScores(arr);
		int[] positions = new int[totalsOfStudents.length];

		for(int count = 0; count < totalsOfStudents.length; count++){

			int position = 1;

			for(int index = 0; index < totalsOfStudents.length; index++){

				if(totalsOfStudents[count] < totalsOfStudents[index]){

					position++;

				}
			
			}

			positions[count] = position;
		}

		return positions;

	}



	//Highest Scoring Student in Each Subject
	public static int[] highestStudentScore(int[][] arr){

		int[] highestScore = new int[arr[0].length];
		

		for(int count = 0; count < arr[0].length; count++){
			int largest = 0;

			for(int index = 0; index < arr.length; index++){

				if(arr[index][count] > largest){

					largest = arr[index][count];

				}	
	
			}

			highestScore[count] = largest;
		}

		return highestScore;
	
	}


	
	//Highest Scoring Student Number
	public static int[] highestStudent(int[][] arr){

		int[] highestScores = highestStudentScore(arr);
		int[] highestStudent = new int[highestScores.length];

		for(int count = 0; count < arr[0].length; count++){

			for(int index = 0; index < arr.length; index++){

				if(arr[index][count] == highestScores[count]){

					highestStudent[count] = index + 1;
				}

			}

		}

		return highestStudent;

	}


	
	//Lowest Scoring Student in Each Subject
	public static int[] lowestStudentScore(int[][] arr){

		int[] lowestScore = new int[arr[0].length];
		

		for(int count = 0; count < arr[0].length; count++){
			int smallest = 100;

			for(int index = 0; index < arr.length; index++){

				if(arr[index][count] < smallest){

					smallest = arr[index][count];

				}	
	
			}

			lowestScore[count] = smallest;
		}

		return lowestScore;
	
	}



	//Lowest Scoring Student Number
	public static int[] lowestStudent(int[][] arr){

		int[] lowestScores = lowestStudentScore(arr);
		int[] lowestStudent = new int[lowestScores.length];

		for(int count = 0; count < arr[0].length; count++){

			for(int index = 0; index < arr.length; index++){

				if(arr[index][count] == lowestScores[count]){

					lowestStudent[count] = index + 1;
				}

			}

		}

		return lowestStudent;

	}



	//Total Scores of Each Subject
	public static int[] totalScoresOfSubjects(int[][] arr){

		int[] totalsOfEachSubject = new int[arr[0].length];
		
		for(int count = 0; count < arr[0].length; count++){

			int total = 0;

			for(int index = 0; index < arr.length; index++){

				total += arr[index][count];
			}

			totalsOfEachSubject[count] = total;

		}

		return totalsOfEachSubject;

	} 



	//Average Scores of Each Subject
	public static double[] averageOfSubjects(int[][] arr){

		int[] total = totalScoresOfSubjects(arr);
		double[] averagesOfEachSubject = new double[total.length];
		
		for(int count = 0; count < total.length; count++){

			averagesOfEachSubject[count] = total[count] / arr.length; 

		}

		return averagesOfEachSubject;

	}



	//Number of Passes For Each Subject
	public static int[] numberOfSubjectPasses(int[][] arr){

		int[] passesOfEachSubject = new int[arr[0].length];
		
		for(int count = 0; count < arr[0].length; count++){

			int passCounter = 0;

			for(int index = 0; index < arr.length; index++){

				if(arr[index][count] >= 45){

					passCounter++;
				}

			}

			passesOfEachSubject[count] = passCounter;
		}

		return passesOfEachSubject;
	}


	
	//Number of Failures For Each Subject
	public static int[] numberOfSubjectFailures(int[][] arr){

		int[] passesOfEachSubject = numberOfSubjectPasses(arr);
		int[] failuresOfEachSubject = new int[passesOfEachSubject.length];
		
		for(int count = 0; count < passesOfEachSubject.length; count++){

			failuresOfEachSubject[count] = arr.length - passesOfEachSubject[count];

		}
		
		return failuresOfEachSubject;
	}



	//Hardest Subject 
	public static int hardestSubject(int[][] arr){

		int[] failedStudents = numberOfSubjectFailures(arr);
		int largest = 0;

		for(int count = 0; count < failedStudents.length; count++){

			if(failedStudents[count] > largest){

				largest = count + 1;

			}
		}

		return largest;
	}



	//Hardest Subject Number Of Failures
	public static int hardestSubjectFailures(int[][] arr){

		int index = hardestSubject(arr) - 1;

		return numberOfSubjectFailures(arr)[index];

	}



	//Easiest Subject
	public static int easiestSubject(int[][] arr){

		int[] passedStudents = numberOfSubjectPasses(arr);
		int largest = 0;

		for(int count = 0; count < passedStudents.length; count++){
	
			if(passedStudents[count] > largest){

				largest = count + 1;

			}
		}

		return largest;

	}



	//Easiest Subject Number Of Passes
	public static int easiestSubjectPasses(int[][] arr){

		int index = easiestSubject(arr) - 1;

		return numberOfSubjectPasses(arr)[index];

	}		



	//Overall Highest Score
	public static int overallHighestScore(int[][] arr){

		int[] highestSubjectScores = highestStudentScore(arr);
		int score = 0;

		for(int count = 0; count < highestSubjectScores.length; count++){

			if(highestSubjectScores[count] > score){

				score = highestSubjectScores[count];

			}
		}

		return score;
	}



	//Overall Highest Scored Subject
	public static int overallHighestScoredSubject(int[][] arr){
	
		int[] highestSubjectScores = highestStudentScore(arr);
		int score = overallHighestScore(arr);
		int subject = 0;

		for(int count = 0; count < highestSubjectScores.length; count++){

			if(highestSubjectScores[count] == score){

				subject = count + 1;
			}
		}

		return subject;
	}



	//Overall Highest Scoring Student
	public static int overallHighestScoringStudent(int[][] arr){

		int score = overallHighestScore(arr);
		int subjectIndex = overallHighestScoredSubject(arr) - 1;
		int student = 0;

		for(int studentIndex = 0; studentIndex < arr.length; studentIndex++){

			if(arr[studentIndex][subjectIndex] == score){

				student = studentIndex + 1;
			}
		}

		return student;
	}



	//Overall Lowest Score
	public static int overallLowestScore(int[][] arr){

		int[] lowestSubjectScores = lowestStudentScore(arr);
		int score = 100;

		for(int count = 0; count < lowestSubjectScores.length; count++){

			if(lowestSubjectScores[count] < score){

				score = lowestSubjectScores[count];

			}
		}

		return score;
	}



	//Overall Lowest Scored Subject
	public static int overallLowestScoredSubject(int[][] arr){
	
		int[] lowestSubjectScores = lowestStudentScore(arr);
		int score = overallLowestScore(arr);
		int subject = 0;

		for(int count = 0; count < lowestSubjectScores.length; count++){

			if(lowestSubjectScores[count] == score){

				subject = count + 1;
			}
		}

		return subject;
	}



	//Overall Lowest Scoring Student
	public static int overallLowestScoringStudent(int[][] arr){

		int score = overallLowestScore(arr);
		int subjectIndex = overallLowestScoredSubject(arr) - 1;
		int student = 0;

		for(int studentIndex = 0; studentIndex < arr.length; studentIndex++){

			if(arr[studentIndex][subjectIndex] == score){

				student = studentIndex + 1;
			}
		}

		return student;
	}



	//Best Graduating Student
	public static int bestGraduatingStudent(int[][] arr){
		
		int[] studentRankings = positionOfStudents(arr);
		int smallest = 0;
		int student = 0;

		for(int count = 0; count < studentRankings.length; count++){

			if(studentRankings[count] > smallest){

				smallest = studentRankings[count];
				student = smallest;
			}

		}
		
		return student;
	}


	//best graduating student 2
	public static int bestGradStudent(int[][] arr){

		int[] totalScore =  totalOfScores(arr);
		int largest = totalScore[0];
		int student = 0;

		for(int count = 0; count < totalScore.length; count++){

			if(totalScore[count] > largest){

				largest = totalScore[count];
				student = count + 1;

			}

		}

		return student;

	}


	//BGS Total Score
	public static int bestGraduatingTotal(int[][] arr){

		int[] studentTotals = totalOfScores(arr);
		int bestStudentIndex = bestGradStudent(arr) - 1;

		return studentTotals[bestStudentIndex];

	}



	//best grad student total score
	public static int bestGradTotal(int[][] arr){

		int[] totals = totalOfScores(arr);
		int result = 0;

		for(int count = 0; count < totals.length; count++){

			if(count == bestGradStudent(arr) - 1){

				result = totals[count];

			}

		}

		return result;

	}



	//Worst Graduating Student
	public static int worstGraduatingStudent(int[][] arr){

		int[] studentRankings = positionOfStudents(arr);
		int largest = studentRankings.length + 1;
		int student = 0;

		for(int count = 0; count < studentRankings.length; count++){

			if(studentRankings[count] < largest){

				largest = studentRankings[count];
				student = largest;
			}

		}

		return student;

	}


	//worst graduating student 2
	public static int worstGradStudent(int[][] arr){

		int[] totalScore =  totalOfScores(arr);
		int smallest = totalScore[0];
		int student = 1;

		for(int count = 0; count < totalScore.length; count++){

			if(totalScore[count] < smallest){

				smallest = totalScore[count];
				student = count + 1;

			}

		}

		return student;

	}



	//Worst Graduating Student Total Score
	public static int worstGraduatingTotal(int[][] arr){

		int[] studentTotals = totalOfScores(arr);
		int worstStudentIndex = worstGradStudent(arr) - 1;

		return studentTotals[worstStudentIndex];

	}


	//worst grad student total score
	public static int worstGradTotal(int[][] arr){

		int[] totals = totalOfScores(arr);
		int result = 0;

		for(int count = 0; count < totals.length; count++){

			if(count == worstGradStudent(arr) - 1){

				result = totals[count];

			}

		}

		return result;

	}



	//Class Total Score
	public static int classTotalScore(int[][] arr){

		int[] subjectTotals = totalOfScores(arr);
		int sum = 0;

		for(int count = 0; count < subjectTotals.length; count++){

			sum += subjectTotals[count];

		}

		return sum;

	} 



	//Class Average Score
	public static double classAverageScore(int[][] arr){

		double average = classTotalScore(arr) / arr.length;

		return average;

	}



}