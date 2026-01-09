#user_input = input("Hello, Kindly Enter Card details to verify: ")
#card_number = int(user_input)







#Length of Card

def length_of_card(user_input):

	length = len(str(user_input))
	return length

#print(length_of_card(card_number))


#Card in a List

def card_in_list(user_input):

	card_list = []
	for count in range(0,length_of_card(user_input),1):
		card_list.append(user_input)

	return card_list

print(card_in_list(12345678987654))