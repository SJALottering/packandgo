package za.ca.cput.adp3capstone.repository;

public interface IRepository <T, ID> {
    public T get(ID id);
    public T create(T t);
    public T update(ID id,T t);
    public boolean delete(ID id);

    }



