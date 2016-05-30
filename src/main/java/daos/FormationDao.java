package daos;

import java.util.ArrayList;

import entities.Formation;


public interface FormationDao {
	public void create(Formation entity);
 	public void update(Formation entity);
	public void delete(Formation entity);
	public Formation getFormationById(long id);
	public ArrayList<Formation> getAllFormations();
}
