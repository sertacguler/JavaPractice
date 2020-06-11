package veritabani.deneme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DatabaseInfo.DATABASE_URL.getValue(),
                DatabaseInfo.KULLANICI_ADI.getValue(),
                DatabaseInfo.SIFRE.getValue());
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }

}
