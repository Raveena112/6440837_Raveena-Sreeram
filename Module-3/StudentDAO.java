import java.sql.*;
public class StudentDAO {
    Connection con;
    StudentDAO() {
        try {
            con = DriverManager.getConnection("jdbc:sqlite:students.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertStudent(int id, String name) {
        try {
            String query = "INSERT INTO students(id, name) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateStudent(int id, String name) {
        try {
            String query = "UPDATE students SET name = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
