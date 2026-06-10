package dao;

import model.Employee;
import util.DBConnection;

import java.sql.*;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "INSERT INTO employees VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getBasicSalary());

            ps.executeUpdate();

            System.out.println(
                    "Employee Added Successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewEmployees() {

        try {

            Connection con =
                    DBConnection.getConnection();

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(
                            "SELECT * FROM employees");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("department") + " "
                        + rs.getDouble("basic_salary"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                            "DELETE FROM employees WHERE id=?");

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println(
                    "Employee Deleted Successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}