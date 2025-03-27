package za.ca.cput.adp3capstone.repisitory;

public interface IRepository <T, ID> {
    public T get(ID id);
    public T create(T t);
    public T update(ID id);
    public boolean delete(ID id);

    }


