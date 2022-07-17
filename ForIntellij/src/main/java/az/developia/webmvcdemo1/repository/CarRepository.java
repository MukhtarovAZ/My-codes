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

    public  List<Car> getCars() {
        List<Car> cars =new ArrayList<Car>();
        try {
            Connection conn=dataSource.getConnection();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from cars");
            while (rs.next()){
                Car c=new Car(rs.getInt("id"),
                        rs.getString("brand"),
                        rs.getInt("speed"));
                cars.add(c);
            }
            rs.close();
            st.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return cars;
    }
    public void save(Car c){
        try {
            Connection conn=dataSource.getConnection();
            Statement st=conn.createStatement();

            Statement stm =conn.createStatement();
            st.executeUpdate("insert into cars (brand,speed)"+
                    "values ('"+c.getBrand()+"'"+c.getSpeed()+");");

            st.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public void deleteById(Integer id){

        try {
            Connection conn=dataSource.getConnection();
            Statement st=conn.createStatement();

            Statement stm =conn.createStatement();
            st.executeUpdate("delete  from cars where id="+id);

            st.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
