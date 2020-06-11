package veritabani.deneme;

import java.sql.*;
import java.util.ArrayList;

public class StartApp {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "DELETE FROM city WHERE id = 4082";
            statement = connection.prepareStatement(sql);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Silindi.");

        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
        selectDemo();
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM country");
            ArrayList<Country> countries = new ArrayList<>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("code"),
                        resultSet.getString("name"),
                        resultSet.getString("continent"),
                        resultSet.getString("region")));
            }
            System.out.println("Country size : " + countries.size());

        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            connection.close();
        }
    }

    public static void insterData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "INSERT INTO city (Name,CountryCode,District,Population) VALUES (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Istanbul");
            statement.setString(2, "TUR");
            statement.setString(3, "Istanbul");
            statement.setInt(4, 76543);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Eklendi.");

        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "UPDATE city SET population=80000 WHERE id = 4082";
            statement = connection.prepareStatement(sql);
            int result = statement.executeUpdate();
            System.out.println("Kayıt Güncellendi.");

        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
    }
}
