package com.micro.enums;

public enum Services {
    KAREN_DATA("karen-data"),
    KAREN_BOT("karen-bot"),
    ;

    private final String title;

    Services(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
