package az.developia.webmvcdemo1.repository;

import az.developia.webmvcdemo1.model.Car;
import az.developia.webmvcdemo1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Repository
public class UserRepository {
    @Autowired
    private DataSource dataSource;

    public void save(User user) {
        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();

            Statement stm = conn.createStatement();
            st.executeUpdate("insert into cars (brand,speed,made_date)" +
                    "values ('" + user.getUsername()+ "'" + user.getPassword()+";");
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
