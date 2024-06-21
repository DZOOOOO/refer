package com.demo1.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PasswordEncoderTest {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("수동 등록한 passwordEncoder 주입 받아와 문자열 암호화")
    void test() {
        String password = "Robbie's password";

        // 암호화
        String encoderPassword = passwordEncoder.encode(password);
        System.out.println("encoderPassword = " + encoderPassword);

        String inputPassword = "Robbie";

        // 복호화를 통해 암호화된 비밀번호와 비교
        boolean matches = passwordEncoder.matches(inputPassword, encoderPassword);
        System.out.println("matches = " + matches);
    }
}