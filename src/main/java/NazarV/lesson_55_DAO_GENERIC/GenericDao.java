package NazarV.lesson_55_DAO_GENERIC;


import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public interface GenericDao<T,PK extends Serializable> {
    public T create(T object) throws DaoException;

    public T read(int key) throws DaoException;

    public void update(T object) throws DaoException;

    public void delete(T object) throws DaoException;

    public ArrayList<T> getAll() throws DaoException;
}
