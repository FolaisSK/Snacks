def encrypt_message(plaintext, key):
	result = []

	for letter in plaintext:
		if letter.isupper():
			result.append(chr((ord(letter) - ord('A') + key) % 26 + ord('A')))
		elif letter.islower():
			result.append(chr((ord(letter) - ord('a') + key) % 26 + ord('a')))
		else:
			result.append(letter)

	return "".join(result)

 
def decrypt_message(plaintext, key):
	return encrypt_message(plaintext, -key)





menu = """
--------------- CEASAR CIPHER ---------------
1. Encrypt Message
2. Decrypt Message
3. Display Message
0. Exit
---------------------------------------------
"""

is_on = True
plaintext = ""
key = 0
cipher_text = ""

while is_on:
	print(menu)
	option = int(input("Enter Option: "))

	match option:
		case 1:
			print("--------------- ENCRYPT MESSAGE ---------------\n")
			plaintext = input("Enter Plaintext: ")
			key = int(input("Enter Key: "))
			cipher_text = encrypt_message(plaintext, key)
			print("Plaintext Encrypted!!")

		case 2:
			print("--------------- DECRYPT MESSAGE ---------------\n")
			plaintext = input("Enter Plaintext: ")
			key = int(input("Enter Key: "))
			cipher_text = decrypt_message(plaintext, key)
			print("Plaintext Decrypted!!")

		case 3:
			print(f"Message is now: {cipher_text}\n")

		case 0:
			print("Thank you for banking with us 🫡")
			is_on = False

		case _:
			print("Invalid Option")

