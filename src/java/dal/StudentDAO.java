/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.List;
import model.Student;
import java.sql.*;
import java.util.ArrayList;

/**
 * Data Access Object (DAO) for {@link Student}.
 *
 * <p>Provides methods to retrieve and modify student data from the database
 * using the shared JDBC {@code Connection} from {@link DBContext}.</p>
 */
public class StudentDAO extends DBContext {

    //Task1: Lấy dữ liệu từ Database lên hiển thị 
    //b1 : tạo 1 câu lệnh sql thực hiện chức năng 
    private final String GET_STUDENT_SQL = "select * from Student";
    private final String REMOVE_STUDENT_BY_ID_SQL = "DELETE FROM [dbo].[Student]\n"
            + "      WHERE StudentID = ?";

    /**
     * Retrieves all students from the database.
     *
     * @return list of students; {@code null} if a database error occurs
     */
    public List<Student> getListStudent() {
        List<Student> res = new ArrayList<>();
        try {
            PreparedStatement stm = c.prepareStatement(GET_STUDENT_SQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                // Map columns -> constructor parameters in correct order
                // Student(String id, String fullName, String gender, String dob, String email, String phone)
                Student std = new Student(
                        rs.getString("StudentID"),
                        rs.getString("FullName"),
                        rs.getString("Gender"),
                        rs.getString("DOB"),
                        rs.getString("Email"),
                        rs.getString("Phone")
                );
                res.add(std);
            }

        } catch (Exception e) {
            return null;
        }
        return res;
    }

    /**
     * Deletes a student by identifier.
     *
     * @param studentId identifier to delete
     * @return {@code true} if at least one row was affected; otherwise {@code false}
     */
    public boolean removeStudentById(String studentId) {
        try {
            PreparedStatement stm = c.prepareStatement(REMOVE_STUDENT_BY_ID_SQL);
            stm.setString(1, studentId);
            int n = stm.executeUpdate();

            if (n != 0) {
                return true;
            }

        } catch (Exception e) {
        }
        return false;
    }

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.removeStudentById("1");

        for (Student std : dao.getListStudent()) {
            System.out.println(std.toString());
        }
    }

}
