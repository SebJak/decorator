package com.sjk.design.pattern.user;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Support implements Role {
    private Role role;

    public Support(Role role) {
        this.role = role;
    }

    @Override
    public List<String> assignedRoles() {
        return Stream.concat(role.assignedRoles().stream(),
                Stream.of("Support"))
                .collect(Collectors.toList());
    }
}
