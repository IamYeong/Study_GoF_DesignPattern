package com.gmail.wjdrhkddud2.builder;

public class User {

    private String id;
    private String name;
    private String nickname;
    private String password;

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.nickname = builder.nickname;
        this.password = builder.password;
    }

    public static class Builder {
        private String id;
        private String name;
        private String nickname = "기본닉네임";
        private String password;

        public Builder() {

        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
