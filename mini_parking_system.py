
def park_car(parking_slots, park_slot_number):
    if park_slot_number < 1 or park_slot_number > 20:
        return parking_slots

    parking_index = park_slot_number - 1
    parking_slots[parking_index] = 1
    return parking_slots


def remove_car(parking_slots, remove_slot_number):
    if remove_slot_number < 1 or remove_slot_number > 20:
        return parking_slots

    remove_index = remove_slot_number - 1
    parking_slots[remove_index] = 0
    return parking_slots


def automatic_car_parking(parking_slots, automatic_park_slot_number):
	parking_index = automatic_park_slot_number - 1
	
	for count in range(len(parking_slots)):
		if count == parking_index and parking_slots[parking_index] == 0:
			parking_slots[count] = 1
		elif count == parking_index and parking_slots[parking_index] == 1:
			parking_index += 1
	return parking_slots

	


menu = """
--------- MINI PARKING SYSTEM ----------
1. Park Car
2. Remove Car
3. Display Parking Status
0. Exit 
---------------------------------------- """

parking_menu = """
--------------- PARK CAR ----------------
1. Automatic Parking
2. Manual Parking
0. Exit
----------------------------------------- """


car_park_slot = [0] * 20

automatic_car_slot = 0

is_on = True

while is_on:
	print(menu)

	option = input("Enter an option: ")

	match option:
		case "1":
			print(parking_menu)

			option = input("Enter an option: ")
	
			match option:
				case "1":
					print("------------- AUTOMATIC PARKING ------------")

					automatic_car_slot = 1
					automatic_car_parking(car_park_slot, automatic_car_slot)
					automatic_car_slot += 1
					print("Car has been successfully parked!!")

				case "2":
					print("------------- MANUAL PARKING -------------")
			
					parked_slot_number = int(input("What slot would you like to enter?(1 - 20): "))

					if parked_slot_number < 1 or parked_slot_number > 20:
						print("No Car Slot!")
					elif car_park_slot[parked_slot_number - 1] == 1:
						print("Slot Occupied!")
					else:
						park_car(car_park_slot, parked_slot_number)

				case "0":
					print("EXITING>>>>>>>>>>>>>>>>>>>>>>>>>>")			
		
				case _:
					print("Invalid Option")		
			

		case "2":
			print("------------ REMOVE CAR -----------")
	
			removed_slot_number = int(input("What slot would you like removed?(1 - 20): "))

			if removed_slot_number < 1 or removed_slot_number > 20:
				print("No Car Slot!")
			elif car_park_slot[removed_slot_number - 1] == 0:
				print("Slot Vacant!")
			else:
				remove_car(car_park_slot, removed_slot_number)



		case "3":
			print("------------ PARKING STATUS -----------")
			
			print("1 = Occupied\n0 = Vacant\n")
			print("SLOTS\tSTATUS")

			slot_number = 1
			for slot in car_park_slot:
				print(f"SLOT {slot_number}\t {slot}")
				slot_number += 1

		case "0":
			print("EXITING>>>>>>>>>>>>>>>>>>>>>>>>>>")
			is_on = False

		case _:
			print("Invalid Option")









