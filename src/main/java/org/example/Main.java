package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "2222 № 222222";
        post.patronymic = "Иванович";
        post.phone = "7 (999) -999-99-99";
        post.surname = "Иванов";

        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 22;
        post.birthday.month = 10;
        post.birthday.year = 1991;
    }
}