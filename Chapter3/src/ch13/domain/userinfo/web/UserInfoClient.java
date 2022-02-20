package ch13.domain.userinfo.web;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDAO;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDAO;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);
        String dbType = prop.getProperty("DBTYPE");
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo();
        UserInfoDAO userInfoDAO = null;


        if (dbType.equals("ORACLE")){
            userInfoDAO = new UserInfoOracleDAO();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDAO = new UserInfoMysqlDAO();
        }
        else{
            System.out.println("DB ERROR");
            return;
        }

        userInfoDAO.insertUserInfo(userInfo);

    }
}
