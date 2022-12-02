package com.fse.agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AgeCalculator {

	private static Log logger = LogFactory.getLog(AgeCalculator.class);

	public static void main(String[] args) {

		System.out.println("********Welcome to Age Calculator Space**********");
		System.out.println("Enter your Date of Birth in DD-MM-YYYY format");

		try (Scanner scanner = new Scanner(System.in)) {
			String dateOfBirth = scanner.next();
			DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			Period period = Period.between(LocalDate.parse(dateOfBirth, dateformatter), LocalDate.now());
			logger.info("You are " + period.getYears() + " years, " + period.getMonths() + " months and "
					+ period.getDays() + " days old");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
