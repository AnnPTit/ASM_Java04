package repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import org.hibernate.Transaction;

import org.hibernate.Session;

import entity.User;
import util.HibernateUtil;

public class UserRepository {

	public List<User> getList() {

		List<User> list = new ArrayList();
		try (Session session = HibernateUtil.getFACTORY().openSession()) {
			Query query = session.createQuery("FROM User where isActive=1");
			list = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return list;
	}

	public User logIn(String user, String pass) {
		try (Session session = HibernateUtil.getFACTORY().openSession()) {
			Query query = session.createQuery("FROM User where username=: user and password =:pass");
			query.setParameter("user", user);
			query.setParameter("pass", pass);
			User user2 = (User) query.getSingleResult();
			return user2;
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return null;
	}

	public Boolean updateUser(User user) {
		Transaction tran = null;
		try (Session session = HibernateUtil.getFACTORY().openSession()) {
			tran = session.beginTransaction();
			session.update(user);
			tran.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return false;
	}

	public Boolean createUser(User user) {
		Transaction tran = null;
		try (Session session = HibernateUtil.getFACTORY().openSession()) {
			tran = session.beginTransaction();
			session.save(user);
			tran.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return false;
	}

	public User getUserbyUserName(String user) {
		try (Session session = HibernateUtil.getFACTORY().openSession()) {
			Query query = session.createQuery("FROM User where username=: user ");
			query.setParameter("user", user);
			User user2 = (User) query.getSingleResult();
			return user2;
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return null;
	}

	public User getUserByEmail(String email) {
		try (Session session = HibernateUtil.getFACTORY().openSession()) {
			Query query = session.createQuery("FROM User where email=: email ");
			query.setParameter("email", email);
			User user2 = (User) query.getSingleResult();
			return user2;
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return null;
	}

	public User getUserByID(int id) {
		try (Session session = HibernateUtil.getFACTORY().openSession()) {
			Query query = session.createQuery("FROM User where id=: id ");
			query.setParameter("id", id);
			User user2 = (User) query.getSingleResult();
			return user2;
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		return null;
	}

}
