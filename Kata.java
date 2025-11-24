public class Kata{


public static boolean isEven(int number){

if (number % 2 == 0){

return true;
} else {

return false;
}

}


public static int subtract(int firstNumber, int secondNumber){

int difference = firstNumber - secondNumber;

if(difference < 0){
difference = difference * -1;
}
return difference;
}


public static double divide(int firstNumber, int secondNumber){

float quotient = firstNumber / secondNumber;

if (secondNumber == 0){
quotient = 0;
return quotient;
} 
return quotient;
}


public static boolean isSquare (int number){

double squareRoot = Math.sqrt(number);

if ((squareRoot * 10) % 10 == 0){
return true;

} else {
return false;
}

}



public static boolean isPalindrome (int number) {

int digitOne = number / 10000;
int digitTwo = (number / 1000) % 10;
int digitThree = (number / 100) % 10;
int digitFour = (number / 10) % 10;
int digitFive = number % 10;

if (digitOne == digitFive && digitTwo == digitFour){

return true;

} else {

return false;

}

}



public static long factorialOf (int number) {

int total = 0;
int count = 0;
int factorial = 1;
for(count = 1; count <= number; count++){

factorial *= count; 
}
return factorial;

}



public static long squareOf (int number) {

int square = number * number;

return square;
}



public static boolean isPrimeNumber (int number) {

int divisor = number / 2;
int count = 0;
if (number % divisor == 0){
return false;
}
for(count = 2; count <= divisor; count++){

if (number % divisor != 0){

return true;

}

}
return false;
}



public static int factorOf (int number) {

int count = 0;
int total = 0;
for(count = 1; count <= number; count++){
if(number % count == 0){
total += 1;

}
}
return total;
}





}