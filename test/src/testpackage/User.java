package testpackage;

import java.util.Scanner;

public class User {
    private String username = "sekiro";
    private String password = "543001";

    public User() {
    }

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;

        int i = 0;
        while (i<3) {
            System.out.println("请输入用户名和密码");
            username = sc.next();
            password = sc.next();
            if (username.equals(this.username) && password.equals(this.password)) {
                System.out.println("登陆成功！！！");
                break;
            } else {
                if (i == 2) {
                    System.out.println("失败3次，暂时无法登陆");
                    break;
                }
                System.out.println("用户名或密码错误，您还有" + (2 - i) + "次机会");
            }
            i++;
        }
    }


}