from datetime import datetime, date, timedelta


# Last Period Start Date
def last_period_start_date(last_period_input):
	last_period_date = datetime.strptime(last_period_input, "%Y-%m-%d")
	return last_period_date


# Next Period Start Date
def next_period_start_date(last_period, cycle_length):
	next_period_date = last_period + timedelta(days=cycle_length)
	return next_period_date 


# Ovulation Date
def ovulation_date(next_period):
	ovulation_day = next_period - timedelta(days=14)
	return ovulation_day


# Menstrual Phase
def menstrual_phase(last_period, period_length):
	end_of_period = last_period + timedelta(days=period_length - 1)
	return f"{last_period.date()} to {end_of_period.date()}"


# Fertile Window
def fertile_window(ovulation):
	start_day = ovulation - timedelta(days=5)
	end_day = ovulation + timedelta(days=1)
	return f"{start_day.date()} to {end_day.date()}"


# Safe Periods
def safe_periods(last_period, next_period, period_length):
    first_safe_start = last_period
    first_safe_end = last_period + timedelta(days=period_length)

    second_safe_start = next_period - timedelta(days=8)
    second_safe_end = next_period

    return f"{first_safe_start.date()} to {first_safe_end.date()} and {second_safe_start.date()} to {second_safe_end.date()}"



cycle_length = int(input("Enter Cycle Length(days): "))
period_length = int(input("Enter Period Length(days): "))

last_period_input = input("Enter Last Period Start Date (yyyy-MM-dd): ")
print()

last_period = last_period_start_date(last_period_input)
next_period = next_period_start_date(last_period, cycle_length)
ovulation = ovulation_date(next_period)

print("======== USER'S REPORT ========")
print("Next Period Date:", next_period.date())
print("Ovulation Date:", ovulation.date())
print("Menstrual Phase:", menstrual_phase(last_period, period_length))
print("Fertile Window:", fertile_window(ovulation))
print("Safe Periods:", safe_periods(last_period, next_period, period_length))


