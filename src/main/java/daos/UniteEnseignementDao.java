package daos;

import java.util.ArrayList;

import entities.Matiere;
import entities.UniteEnseignement;

public interface UniteEnseignementDao {
	public void create(UniteEnseignement entity);
 	public void update(UniteEnseignement entity);
	public void delete(UniteEnseignement entity);
	public UniteEnseignement getUniteById(long id);
	public ArrayList<UniteEnseignement> getAllUnites();
}
