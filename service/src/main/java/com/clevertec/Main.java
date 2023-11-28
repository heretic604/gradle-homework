package com.clevertec;

import com.clevertec.dto.user.UserDto;

public class Main {
    public static void main(String[] args) {

        UserDto ivan = new UserDto("Ivan", 20, "ivan@mail.ru");
        System.out.println(ivan);
    }
}