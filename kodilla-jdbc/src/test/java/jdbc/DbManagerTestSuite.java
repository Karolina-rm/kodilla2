package jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test

    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When

        String sqlQuery = "select USERS.ID, USERS.FIRSTNAME, USERS.LASTNAME, count(*) as POSTS_NUMBER\n" +
                "from USERS \n" +
                "join POSTS on POSTS.USER_ID = USERS.ID\n" +
                "group by POSTS.USER_ID\n" +
                "having count(*)>=2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then

        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("ID") + ". " +
                    resultSet.getString("FIRSTNAME") + " " +
                    resultSet.getString("LASTNAME"));
            counter++;
        }
        resultSet.close();
        statement.close();

        Assert.assertEquals(2, counter);
    }
}

