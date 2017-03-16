package skiworld.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import skiworld.persistence.EventHolder;
import skiworld.persistence.Instructor;
import skiworld.persistence.Player;
import skiworld.persistence.RestaurantManager;
import skiworld.persistence.SkiMan;
import skiworld.persistence.User;
import skiworld.persistence.Worker;

@Stateless
public class HandelUser implements IHandelUser {
	@PersistenceContext
	EntityManager em;

	@Override
	public void addSkiMan(SkiMan skiman) {
		em.persist(skiman);
	}

	@Override
	public void addInstructor(Instructor instructor) {
		em.persist(instructor);
	}

	@Override
	public void addEventHolder(EventHolder eventHolder) {
		em.persist(eventHolder);
	}

	@Override
	public void addPlayer(Player player) {
		em.persist(player);
	}

	@Override
	public void addWorker(Worker worker) {
		em.persist(worker);
	}

	@Override
	public void addRestaurantManager(RestaurantManager restaurantManager) {
		em.persist(restaurantManager);
	}

	@Override
	public List<User> getUser() {

		TypedQuery<User> querry = em.createQuery("select u from User u", User.class);
		return querry.getResultList();

	}
	public String getStatus() {
		Query q= em.createNamedQuery("select u from User u u.Status=:Status", User.class);
		return (String) q.getSingleResult();
//		TypedQuery querry2 = em.createQuery("select u from User u u.Status=:Status", User.class);
//		return (String) querry2.getSingleResult();
	}

	@Override
	public void removeSkiMan(SkiMan skiman) {
	em.remove(skiman);
		
	}

	@Override
	public void updateSkiMan(SkiMan skiman) {
		// TODO Auto-generated method stub
		
	}

}
