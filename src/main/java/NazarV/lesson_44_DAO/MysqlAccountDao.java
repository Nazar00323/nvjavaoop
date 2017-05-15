package NazarV.lesson_44_DAO;

import NazarV.bank.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlAccountDao implements AccountDao {
    private Connection connection;

    public MysqlAccountDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Account create() throws SQLException {
         String INSERT_NEW = "INSERT INTO account(number,password,balance) values(?,?,?)";
        PreparedStatement prStatment = null;
        Account account = new Account();
        

        try {
           /* prStatment = connection.prepareStatement(INSERT_NEW);
            prStatment.setString(1, number);
            prStatment.setDouble(2, balance);
            prStatment.setString(3, password);
            prStatment.execute();*/

            System.out.println("Новий рахунок було створено ");

        } catch (Exception e) {
            System.out.println("Рахунок не було створено");

            System.out.println(e.getMessage());

        } finally {
            if (prStatment != null) {
                prStatment.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return account;
    }

    @Override
    public Account read(int key) throws SQLException {
        return null;
    }

    @Override
    public void update(Account account) throws SQLException {

    }

    @Override
    public void delete(Account account) throws SQLException {

    }

    @Override
    public ArrayList<Account> getAll() throws SQLException {
        return null;
    }
}
