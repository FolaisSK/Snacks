from datetime import datetime


def invoice_date_and_time():
	return datetime.now().strftime("%d-%b-%Y %H:%M:%S")


def price_totals(unit_prices, units):
	total_prices = []
	for count in range(len(unit_prices)):
		total = unit_prices[count] * units[count]
		total_prices.append(total)
	return total_prices


def sub_total(total_prices):
	total = 0
	for count in range(len(total_prices)):
		total += total_prices[count]
	return total


def total_vat(total_prices):
	return sub_total(total_prices) * 0.075


def total_discount(total_prices, discount_value):
	return sub_total(total_prices) * (discount_value / 100)


def bill_total(total_prices, discount_value):
	return sub_total(total_prices) - total_discount(total_prices, discount_value) + total_vat(total_prices)


def balance_of_bill(total_prices, discount_value, paid_value):
	return paid_value - bill_total(total_prices, discount_value)



customer_name = input("What is the customer's name: ")
number_of_items = int(input("How many items is the customer purchasing: "))

items = []
units = []
unit_prices = []

for count in range(number_of_items):
	item_name = input("What did the user buy: ")
	items.append(item_name)

	unit = float(input("How many pieces: "))
	units.append(unit)

	unit_price = float(input("How much per unit: "))
	unit_prices.append(unit_price)

	print("Item successfully added!")

cashier_name = input("What is your name: ")
discount_on_items = float(input("How much discount will the customer get: "))

items_price_totals = price_totals(unit_prices, units)

header = """
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 09079358997
"""
line = "-" * 60

# INVOICE
print(header)
print("Date:", invoice_date_and_time())
print("Cashier:", cashier_name)
print("Customer Name:", customer_name)

print(line)
print("ITEM\tQTY\tPRICE\tTOTAL(NGN)")
print(line)

for count in range(len(items)):
	print(f"{items[count]}\t{units[count]}\t{unit_prices[count]}\t{items_price_totals[count]}")

print(line)

items_sub_total = sub_total(items_price_totals)
print("Sub Total:", items_sub_total)

discount = total_discount(items_price_totals, discount_on_items)
print("Discount:", discount)

vat = total_vat(items_price_totals)
print("VAT @ 7.5%:", vat)

print(line)

items_bill_total = bill_total(items_price_totals, discount_on_items)
print("The total bill to be paid:", items_bill_total)

print(line)
print("THIS IS NOT A RECEIPT KINDLY PAY:", items_bill_total)
print(line)

amount_paid = 0
while amount_paid < items_bill_total:
	amount_paid = float(input("How much did the customer give you? "))

# RECEIPT
print(header)
print("Date:", invoice_date_and_time())
print("Cashier:", cashier_name)
print("Customer Name:", customer_name)

print(line)
print("ITEM\tQTY\tPRICE\tTOTAL(NGN)")
print(line)

for count in range(len(items)):
	print(f"{items[count]}\t{units[count]}\t{unit_prices[count]}\t{items_price_totals[count]}")

print(line)
print("Sub Total:", items_sub_total)
print("Discount:", discount)
print("VAT @ 7.5%:", vat)

print(line)
print("The total bill to be paid:", items_bill_total)
print("Amount Paid:", amount_paid)
print("Balance:", balance_of_bill(items_price_totals, discount_on_items, amount_paid))

print(line)
print("THANK YOU FOR SHOPPING WITH SEMICOLON STORES!!!")
print(line)


