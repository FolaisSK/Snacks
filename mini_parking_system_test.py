import unittest
from mini_parking_system import park_car, remove_car

class TestForMiniParkingSystem(unittest.TestCase):
	def test_that_car_is_parked_in_slot_one(self):
		parking_slots = [0] * 20
		expected = park_car(parking_slots, 1)
		actual = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

		self.assertEqual(expected, actual)