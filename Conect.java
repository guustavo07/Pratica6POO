import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Conect {

    private String url = "jdbc:postgresql://localhost:5432/BDlivrariaUniversitaria";
    private String user = "postgres";
    private String password = "root";
    private Connection conexao;


    public Statement start() {
        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            Statement st = conexao.createStatement();
            return st;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void end() {
        try {
        	conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
