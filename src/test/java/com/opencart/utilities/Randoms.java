package com.opencart.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.RandomStringUtils;

public class Randoms {

	public static String name() {
		String name = RandomStringUtils.randomAlphabetic(7);
		return name;
	}

	public static String valid_emails() {
		String email = RandomStringUtils.randomAlphabetic(7) + "@gmail.com";
		return email;
	}

	public static String invalid_emails() {
		String email = RandomStringUtils.randomAlphabetic(7) + "gmail.com";
		return email;
	}

	public static String phone_number() {
		String phone = RandomStringUtils.randomNumeric(10);
		return phone;
	}

	public static String password() {
		String charectors = RandomStringUtils.randomAlphabetic(3);
		String numbers = RandomStringUtils.randomNumeric(3);
		return charectors + numbers;
	}

	public static String recentExtentReport() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH_mm");
		String formattedDateTime = now.format(formatter);
		formattedDateTime = formattedDateTime.replace(" ", "_").replace("-", "_").replace(":", "_");
		return formattedDateTime;
	}
}
