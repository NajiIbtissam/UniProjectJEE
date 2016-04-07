package daos;

import entities.UniteEnseignement;

public interface UniteEnseignementDao {
	public void create(UniteEnseignement entity);
 	public void update(UniteEnseignement entity);
	public void delete(UniteEnseignement entity);
	public UniteEnseignement getUserById(int id);
}
