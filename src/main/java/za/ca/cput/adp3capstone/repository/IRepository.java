package za.ca.cput.adp3capstone.repository;

/* Employee.java
Repository interface
Author: Ethan Le Roux (222622172)
Date:28 March 2025
*/

public interface IRepository <T, ID> {
    public T get(ID id);
    public T create(T t);
    public T update(ID id,T t);
    public boolean delete(ID id);

    }



