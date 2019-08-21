package com.sjk.design.pattern.user;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Base implements Role {
    Role role;

    public Base(Role role) {
        this.role = role;
    }

    @Override
    public List<String> assignedRoles() {
        return Stream.concat(role.assignedRoles().stream(),
                Stream.of("Base"))
                .collect(Collectors.toList());
    }
}
