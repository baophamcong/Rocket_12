/**
 * 
 */
package com.vti.utils;

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
public interface Constant {

	String EMAIL_REGEX = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

	String PASSWORD_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,12})";

	String USERNAME_REGEX = "^[a-z0-9._-]{3,15}#";

	String FULLNAME_REGEX = "^[a-zA-Z]*$";

}
