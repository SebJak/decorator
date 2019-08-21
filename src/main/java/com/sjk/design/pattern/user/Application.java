package com.sjk.design.pattern.user;

public class Application {

    public static void main(String[] args) {
        Role user = new Admin(new Support(new User()));
        System.out.println(user.assignedRoles());
    }
}
