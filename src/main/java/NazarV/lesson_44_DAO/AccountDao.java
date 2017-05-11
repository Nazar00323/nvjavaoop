package NazarV.lesson_44_DAO;

import NazarV.bank.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AccountDao {
    public Account create() throws SQLException;

    public Account read(int key) throws SQLException;

    public void update(Account account) throws SQLException;

    public void delete(Account account) throws SQLException;

    public ArrayList<Account> getAll() throws SQLException;

}
