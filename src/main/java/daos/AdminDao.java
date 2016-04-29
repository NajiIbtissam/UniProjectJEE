package daos;

import java.util.ArrayList;

import entities.Admin;


public interface AdminDao {
	public void create(Admin entity);
 	public void update(Admin entity);
	public void delete(Admin entity);
	public Admin getAdminByName(String name,String password);
	public ArrayList<Admin> getAllAdmins();

}
