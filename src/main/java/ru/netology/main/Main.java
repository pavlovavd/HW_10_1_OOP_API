package ru.netology.main;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Виктория";
        post.passport = "4444 № 44444444";
        post.patronymic = "Дмитриевна";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Павлова";
        post.subscription = "true";

        post.birthday = new FormDate();
        post.birthday.day = 5;
        post.birthday.month = 10;
        post.birthday.year = 1995;
    }

}
