package com.example.life_community.enums;

public enum NotificationTypeEnum {

    REPLY_QUESTION(1, "回复好问题"),
    REPLY_COMMENT(2, "回复了评论");

    private Integer type;
    private String name;

    NotificationTypeEnum(Integer status, String name) {
        this.type = status;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String nameOfType(int type) {
        for(NotificationTypeEnum notificationTypeEnum : NotificationTypeEnum.values()) {
            if(notificationTypeEnum.getType() == type) {
                return notificationTypeEnum.getName();
            }
        }
        return "";
    }

}
