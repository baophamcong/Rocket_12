/**
 * 
 */
package com.vti.utils;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

/**
 * This class is service of ....
 * 
 * @Description: .
 * @author: BaoPC
 * @create_date: May 28, 2021
 * @version: 1.0
 * @modifer: BaoPC
 * @modifer_date: May 28, 2021
 */
public class Validator {

	public static boolean isValidatorEmail(String email) {
		Pattern pattern = Pattern.compile(Constant.EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean isValidatorPasssword(String password) {

		Pattern pattern = Pattern.compile(Constant.PASSWORD_REGEX);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}

	public static boolean isValidatorUserName(String username) {

		Pattern pattern = Pattern.compile(Constant.USERNAME_REGEX);
		Matcher matcher = pattern.matcher(username);
		return matcher.matches();

	}

	public static boolean isValidatorFullName(String fullname) {

		Pattern pattern = Pattern.compile(Constant.FULLNAME_REGEX);
		Matcher matcher = pattern.matcher(fullname);
		return matcher.matches();

	}

}