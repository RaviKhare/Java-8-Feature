/**
 * 
 */
package main.java.com.dao;

import java.util.ArrayList;
import java.util.List;

import main.java.com.model.Player;

/**
 * @author rk250449
 *
 */
public class StreamDAOImpl {

	  public static List<Player> getPlayerList(){
		  List<Player> employeeList = new ArrayList<Player>();
		  		employeeList.add(new Player(new Long(45678), "Virat Kohli", "A", new Double(50000000), true));
				employeeList.add(new Player(new Long(55678), "Rohit Sharm", "A", new Double(40000000), true));
				employeeList.add(new Player(new Long(65555), "Shikhar Dhawan", "A", new Double(30000000), true));
				employeeList.add(new Player(new Long(55578), "Mahendra Singh Dhoni", "A", new Double(80000000), true));
				employeeList.add(new Player(new Long(66678), "Ravinder Jadeja", "B", new Double(10000000), true));
				employeeList.add(new Player(new Long(45777), "Suresh Raina", "B", new Double(5000000), true));
				employeeList.add(new Player(new Long(11678), "K L Rahul", "B", new Double(5000000), true));
				employeeList.add(new Player(new Long(22678), "Hardik Pandya", "B", new Double(5000000), true));
				employeeList.add(new Player(new Long(33567), "Prithvi Shaw", "C", new Double(2000000), true));
				employeeList.add(new Player(new Long(65455), "Mayank Agarwal", "C", new Double(4000000), true));
				employeeList.add(new Player(new Long(85671), "Kuldeep Yadav", "C", new Double(5500000), true));
				employeeList.add(new Player(new Long(23678), "", "Yusuf Pathan", new Double(1000000), false));
			return employeeList;
			  
	  }
}
