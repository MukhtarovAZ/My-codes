package az.developia.webmvcdemo1.repository
        ;

import az.developia.webmvcdemo1.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {


    @Autowired
    private DataSource dataSource;

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<Car>();
        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from cars");
            while (rs.next()) {
                Car c = new Car(rs.getInt("id"),
                        rs.getString("brand"),
                        rs.getInt("speed"),
                        rs.getDate("made_date"),
                        rs.getString("email") );
                cars.add(c);
            }
            rs.close();
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cars;
    }

    public void save(Car c) {
        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();

            Statement stm = conn.createStatement();
            st.executeUpdate("insert into cars (brand,speed,made_date)" +
                    "values ('" + c.getBrand() + "'" + c.getSpeed() +",'"+c.getMadeDate()+"','"+c.getEmail()+"');");


            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void deleteById(Integer id) {

        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();

            Statement stm = conn.createStatement();
            st.executeUpdate("delete  from cars where id=" + id);

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editById(Integer id) {
        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();

            Statement stm = conn.createStatement();
            st.executeUpdate("update  from cars where id=" + id);

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Car findById(Integer id) {
        Car car=null;
        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from cars where id="+id);
            if (rs.next()) {
                car = new Car(rs.getInt("id"),
                        rs.getString("brand"),
                        rs.getInt("speed"),
                        rs.getDate("made_date"),
                        rs.getString("email"));
            }
            rs.close();
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;

    }
    public void edit(Car c){
        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();

            Statement stm = conn.createStatement();
            st.executeUpdate("update cars set brand='"+c.getBrand()+"" +
                    "',speed='"+c.getSpeed()+"',made_date='"+c.getMadeDate()+"' where id-" + c.getId()   );

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public  List<Car> searchCars(String brand) {
        List<Car> cars = new ArrayList<Car>();
        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery
                    ("select * from cars where brand ='"+brand+"';");
            while (rs.next()) {
                Car c = new Car(rs.getInt("id"),
                        rs.getString("brand"),
                        rs.getInt("speed"),
                        rs.getDate("made_date"),
                        rs.getString("email") );
                cars.add(c);
            }
            rs.close();
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cars;
    }
    }


