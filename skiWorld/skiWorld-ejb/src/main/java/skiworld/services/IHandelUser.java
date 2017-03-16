package skiworld.services;

import java.util.List;

import javax.ejb.Local;

import skiworld.persistence.EventHolder;
import skiworld.persistence.Instructor;
import skiworld.persistence.Player;
import skiworld.persistence.RestaurantManager;
import skiworld.persistence.SkiMan;
import skiworld.persistence.User;
import skiworld.persistence.Worker;
@Local
public interface IHandelUser {
	void addSkiMan(SkiMan skiman);
	void removeSkiMan(SkiMan skiman);
	void updateSkiMan(SkiMan skiman);
	void addInstructor(Instructor instructor);
	void addEventHolder(EventHolder eventHolder);
	void addPlayer(Player player);
	void addWorker(Worker worker);
	void addRestaurantManager(RestaurantManager restaurantManager);
	List<User> getUser();
    String getStatus();
////	String getStatus();
}
