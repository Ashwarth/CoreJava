package com.company;

public final class ImmutableClass {
    private String name;
    private  Age age;

    public ImmutableClass(String name, Age age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }
}
