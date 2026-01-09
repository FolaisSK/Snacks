def maximum_in(numbers):
	largest = numbers[0]
	
	for count in range(len(numbers)):
		if numbers[count] >= largest:
			largest = numbers[count]

	return largest

#print(maximum_in([1,2,3,4,5]))


def minimum_in(numbers):
	smallest = numbers[0]
	
	for count in range(len(numbers)):
		if numbers[count] <= smallest:
			smallest = numbers[count]

	return smallest

#print(minimum_in([1,2,3,4,5]))


def sum_of(numbers):
	total = 0

	for count in range(len(numbers)):
		total += numbers[count]
	return total

#print(sum_of([1,2,3,4,5]))


def sum_of_even_numbers_in(numbers):
	total = 0

	for count in range(len(numbers)):
		if numbers[count] % 2 == 0:
			total += numbers[count]
	return total

#print(sum_of_even_numbers_in([1,2,3,4,5]))


def sum_of_odd_numbers_in(numbers):
	total = 0

	for count in range(len(numbers)):
		if numbers[count] % 2 != 0:
			total += numbers[count]
	return total

#print(sum_of_odd_numbers_in([1,2,3,4,5]))


def maximum_and_minimum_of(numbers):
	largest = numbers[0]
	smallest = numbers[0]

	for count in range(len(numbers)):
		if numbers[count] >= largest:
			largest = numbers[count]

		if numbers[count] <= smallest:
			smallest = numbers[count]

	output = largest, smallest
	return output

#print(maximum_and_minimum_of([1,2,3,4,5]))

def no_of_odd_numbers_in(numbers):
	odd_numbers = 0
	
	for count in range(len(numbers)):
		if numbers[count] % 2 != 0:
			odd_numbers += 1
	return odd_numbers

#print(no_of_odd_numbers_in([1,2,3,4,5]))


def no_of_even_numbers_in(numbers):
	even_numbers = 0
	
	for count in range(len(numbers)):
		if numbers[count] % 2 == 0:
			even_numbers += 1
	return even_numbers

#print(no_of_even_numbers_in([1,2,3,4,5]))


def even_numbers_in(numbers):
	even_list = []
	for count in range(len(numbers)):
		if numbers[count] % 2 == 0:
			even_list.append(numbers[count])
	return even_list

#print(even_numbers_in([1,2,3,4,5]))


def odd_numbers_in(numbers):
	odd_list = []
	for count in range(len(numbers)):
		if numbers[count] % 2 != 0:
			odd_list.append(numbers[count])
	return odd_list

#print(odd_numbers_in([1,2,3,4,5]))


def square_numbers_in(numbers):
	squared_list = []
	for count in range(len(numbers)):
		squared_list.append(numbers[count] ** 2)
	return squared_list

#print(square_numbers_in([1,2,3,4,5]))