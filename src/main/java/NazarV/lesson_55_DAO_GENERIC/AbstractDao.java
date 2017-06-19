package NazarV.lesson_55_DAO_GENERIC;

import org.apache.log4j.Logger;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public abstract class AbstractDao<T, PK extends Serializable> implements GenericDao<T, PK> {
    private Connection connection;
    private static final Logger log = Logger.getLogger(AbstractDao.class);

    public AbstractDao(Connection connection) {
        this.connection = connection;
    }

    public abstract String getSelectQuery();

    public abstract ArrayList<T> parseResultSet(ResultSet rs)throws DaoException;

    @Override
    public T create(T object) throws DaoException {
        return null;
    }

    @Override
    public T read(int key) throws DaoException {
        ArrayList<T> list;
        String SELECT_QUERY = getSelectQuery();
        SELECT_QUERY += " WHERE id =?";
        try (PreparedStatement prStatment = connection.prepareStatement(SELECT_QUERY)) {
            prStatment.setInt(1, key);
            ResultSet rs = prStatment.executeQuery();
            list = parseResultSet(rs);
        } catch (Exception e) {
            log.error("Помилка отримання інформації про об'єкт  по id = " + key);
            log.error(e.getStackTrace());
            throw new DaoException(e);
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        if (list.size() > 1) {
            try {
                throw new DaoException("Отримано більше ніж один об'єкт по даному id" + key);
            } catch (DaoException e) {
                log.error(e.getMessage());
                log.error(e.getStackTrace());
            }
        }
        return list.iterator().next();

    }

    @Override
    public void update(T object) throws DaoException {

    }

    @Override
    public void delete(T object) throws DaoException {

    }

    @Override
    public ArrayList<T> getAll() throws DaoException {
        return null;
    }

    protected GregorianCalendar convertToGregorianCalendar(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return gregorianCalendar;
    }

    protected Date convertToSqlDate(GregorianCalendar gregorianCalendar) {
        return new Date(gregorianCalendar.getTime().getTime());
    }
}
