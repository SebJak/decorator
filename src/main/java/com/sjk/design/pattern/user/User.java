package com.sjk.design.pattern.user;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User implements Role {
    private String name;

    @Override
    public List<String> assignedRoles() {
        return Collections.emptyList();
    }
}
