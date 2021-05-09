package com.vti.backend.repository;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Message;
import com.vti.entity.Relationship;
import com.vti.entity.User;

public interface IUserRepository {
/**
 * 
	 * This method is used for getting list User.
	 * 
	 * @Description: .
	 * @author: BaoPC
	 * @create_date: May 9, 2021
	 * @version: 1.0
	 * @modifer: BaoPC
	 * @modifer_date: May 9, 2021
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
 */
	List<User> getListFriend() throws SQLException;
/**
 * 
	 * This method is send friend request. 
	 * 
	 * @Description: .
	 * @author: BaoPC
	 * @create_date: May 9, 2021
	 * @version: 1.0
	 * @modifer: BaoPC
	 * @modifer_date: May 9, 2021
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
 */
	void createUser() throws SQLException;
/**
 * 
	 * This method is used for accept friend request .
	 * 
	 * @Description: .
	 * @author: BaoPC
	 * @create_date: May 9, 2021
	 * @version: 1.0
	 * @modifer: BaoPC
	 * @modifer_date: May 9, 2021
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
 */
	void updateUser() throws SQLException;
/**
 * 
	 * This method is used for acgetting list User
	 * 
	 * @Description: .
	 * @author: BaoPC
	 * @create_date: May 9, 2021
	 * @version: 1.0
	 * @modifer: BaoPC
	 * @modifer_date: May 9, 2021
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
 */
	List<Relationship> getListAllFriend() throws SQLException;
/**
 * 
	 * This method is used forgetting list 10 User 
	 * 
	 * @Description: .
	 * @author: BaoPC
	 * @create_date: May 9, 2021
	 * @version: 1.0
	 * @modifer: BaoPC
	 * @modifer_date: May 9, 2021
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
 */
	List<User> getList10Friend() throws SQLException;
/**
 * 
	 * This method is used for  getting list Message 
	 * 
	 * @Description: .
	 * @author: BaoPC
	 * @create_date: May 9, 2021
	 * @version: 1.0
	 * @modifer: BaoPC
	 * @modifer_date: May 9, 2021
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
 */
	List<Message> getMessage() throws SQLException;

}
