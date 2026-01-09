def is_even(number):
	if number % 2 == 0:
		return True
	else:
		return False

#print(is_even(8))


def is_prime_number(number):
	index = 0
	for count in range(1, number +1):
		if number % count == 0:
			index += 1

	if index <= 2:
		return True
	else:
		return False

#print(is_prime_number(19))


def subtract(first_number, second_number):
	total = first_number - second_number

	if total < 0:
		total *= -1

	return total

#print(subtract(5, 34))


def divide(first_number, second_number):
	if second_number == 0:
		return 0

	quotient = first_number // second_number

	return quotient

#print(divide(43, 9))


def factor_of(number):
	index = 0
	for count in range (1, number + 1):
		if number % count == 0:
			index +=1

	return index

#print(factor_of(10))


def is_square(number):
	for count in range (1, number + 1):
		if number % count == 0:
			if count ** 2 == number:
				output = True
				return output
			else:
				output = False
	return output
	

#print(is_square(25))


def is_palindrome(number):
	digit_one = number // 10000
	digit_two = (number // 1000) % 10
	digit_four = (number // 10) % 10
	digit_five = number % 10

	if digit_one == digit_five and digit_two == digit_four:
		return True
	else:
		return False

#print(is_palindrome(12321))


def factorial_of(number):
	factorial = 1
	for count in range(number, 0, -1):
		factorial *= count
	return factorial

#print(factorial_of(5))


def square_of(number):
	square = number * number
	return square

#print (square_of(5))