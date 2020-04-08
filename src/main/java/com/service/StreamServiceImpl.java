/**
 * 
 */
package main.java.com.service;

import java.util.List;
import java.util.stream.Collectors;

import main.java.com.dao.StreamDAOImpl;
import main.java.com.model.Player;

/**
 * @author rk
 *
 */
public class StreamServiceImpl {
	
	 public static List<Player> getPlayerListGradeWise(){
		 return StreamDAOImpl.getPlayerList().stream().filter(player -> player.getGrade().equals("A")).collect(Collectors.toList());
	 }

	 public static List<Player> getPlayerListWhoAllActive(){
		 return StreamDAOImpl.getPlayerList().stream().filter(player -> player.getIsPlaying().equals(true)).collect(Collectors.toList());
	 }
}
