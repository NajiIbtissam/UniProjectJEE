package daos;

import entities.Matiere;


public interface MatiereDao {
	public void create(Matiere entity);
 	public void update(Matiere entity);
	public void delete(Matiere entity);
	public Matiere getMatiereById(int id);

}
