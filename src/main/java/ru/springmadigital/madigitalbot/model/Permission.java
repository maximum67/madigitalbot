package ru.springmadigital.madigitalbot.model;

public enum Permission {
    SETTING_READ("setting:read"),
    SETTING_WRITE("setting:write");
    private String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
