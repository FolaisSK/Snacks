
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


	


menu = """
--------- MINI PARKING SYSTEM ----------
1. Park Car
2. Remove Car
3. Display Parking Status
0. Exit 
---------------------------------------- """

car_park_slot = [0] * 20
is_on = True

while is_on:
	print(menu)

	option = input("Enter an option: ")

	match option:
		case "1":
			print("------------ PARK CAR -----------")
			
			parked_slot_number = int(input("What slot would you like to enter?(1 - 20): "))
			
			if parked_slot_number < 1 or parked_slot_number > 20:
				print("No Car Slot!")
			elif car_park_slot[parked_slot_number - 1] == 1:
				print("Slot Occupied!")
			else:
				park_car(car_park_slot, parked_slot_number)
			

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









