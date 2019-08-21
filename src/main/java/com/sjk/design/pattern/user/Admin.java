package com.sjk.design.pattern.user;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin implements Role {

    public Role role;

    public Admin(Role role) {
        this.role = role;
    }

    @Override
    public List<String> assignedRoles() {
        return Stream.concat(role.assignedRoles().stream(),
                Stream.of("Admin"))
                .collect(Collectors.toList());
    }
}
