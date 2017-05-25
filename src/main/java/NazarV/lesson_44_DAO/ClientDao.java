package NazarV.lesson_44_DAO;

import NazarV.bank.Client;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ClientDao {
    public Client create(Client client) throws SQLException;

    public Client read(int key) throws SQLException;

    public void update(Client client) throws SQLException;

    public void delete(Client client) throws SQLException;

    public ArrayList<Client> getAll() throws SQLException;
}

