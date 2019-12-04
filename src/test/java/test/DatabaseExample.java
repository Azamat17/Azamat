package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseExample {

    public static void main(String[] args) {

        // url: ec2-52-14-54-167.us-east-2.compute.amazonaws.com
        // username: hr
        // password: hr

        String oracleUrl = "jdbc:oracle:thin:@ec2-52-14-54-167.us-east-2.compute.amazonaws.com:1521:xe";
        String oracleUsername = "hr";
        String oraclePassword = "hr";

        try {
            Connection connection = DriverManager.getConnection(oracleUrl, oracleUsername, oraclePassword);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("SELECT first_name, last_name FROM employees");

//            resultSet.next();
//
//            System.out.println("FirstName: " + resultSet.getObject(1));
//
//            resultSet.next();
//            resultSet.next();
//            resultSet.next();
//
//            System.out.println("FirstName: " + resultSet.getObject(1));

            /*
            *
            | first_name    | last_name |
            | Ellen         | Abel      |
            *
            | first_name    | last_name |
            | Sunder        | Ande      |
            *
            | first_name    | last_name |
            | Mozhe         | Atkinson  |
            *
            *
            *
            * */
            Map<String, Object> map1 = new HashMap<>();
            map1.put("first_name", "Ellen");
            map1.put("last_name", "Abel");

            Map<String, Object> map2 = new HashMap<>();
            map2.put("first_name", "Sunder");
            map2.put("last_name", "Ande");

            List<Map<String, Object>> table = new ArrayList<>();
            table.add(map1);
            table.add(map2);

            for (Map<String, Object> t : table){
                System.out.println(t.get("first_name") + " " + t.get("last_name"));
            }


            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            String columName = metaData.getColumnName(1);

            System.out.println("Column count: " + columnCount);
            System.out.println("Column name: " + columName);

            List<Map<String, Object>> myTable = new ArrayList<>();

            while (resultSet.next()){

                Map<String, Object> map = new HashMap<>();

                for(int i = 1; i <= columnCount; i++){
                    map.put(metaData.getColumnName(i), resultSet.getObject(i));
                }
                myTable.add(map);
            }

            for(Map<String, Object> m: myTable){
                System.out.println(m.get("FIRST_NAME")+" == "+m.get("LAST_NAME"));
            }


        } catch (SQLException e){
            System.out.println("Failed to open a connection!");
        }


    }
}
