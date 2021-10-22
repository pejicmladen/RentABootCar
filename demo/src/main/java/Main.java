import com.example.demo.dao.CarDaoSQL;
import com.example.demo.db.DatabaseConnection;
import com.example.demo.model.CarModel;
import com.example.demo.model.UserModel;
import com.example.demo.model.request.CarSearchModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public class Main {
    private static final Connection conn = DatabaseConnection.getConnection();

    public static void main(String[] args) {

    }
}
