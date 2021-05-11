package com.unacademy;
import java.sql.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Connection conn;
	    try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee", "root","root");
			Statement stmt;
			stmt = conn.createStatement();
			String sql = "insert into emp(emp_id,emp_name,city,salary,work_hour)values(10,'new','sng',50000,4)";
			stmt.addBatch(sql);
			int[] count = stmt.executeBatch();
			System.out.println(Arrays.toString(count));
		}
	    catch (SQLException e) {
			e.printStackTrace();
		}
    }

}


