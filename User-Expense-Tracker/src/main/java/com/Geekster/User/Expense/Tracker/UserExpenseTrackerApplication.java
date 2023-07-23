package com.Geekster.User.Expense.Tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserExpenseTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserExpenseTrackerApplication.class, args);
	}

}
/*	Expense tracker:- Develop a API that allows users to track their expenses. Users can create, read, update, and delete expenses, and generate reports on the month end or weekly.
		User must be sign-in/register.
		Product on which you spent:
		title,description, price, date, time,userId
		also write a API to fetch all the product for a particular date and time. Time can be not required.
		generate the total expenditure on that given (user will provide month)
		keep the record of at-least of 3 months.
		following points to be followed:-
		MySQL database and IP address of the deployment link must be static.
		You must use validation and that must be annotation based validation.
		Make sure that you should create controller service and repository. */