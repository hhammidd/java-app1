package com.hamidApp1.controller.usersGisController;

import com.hamidApp1.service.util.Util;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

public class TestJava {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            String password = "123456";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode(password);

            System.out.println(hashedPassword);
            i++;

        }
        System.out.println("vvvvvvvvvvvv");
        String secretKey = null;
        secretKey = Util.getJwtsSecretKey();
        String token = "";
        Date date = new Date();
        long t = date.getTime();
        final int twoHours = 7200000;
        token = Jwts.builder().setSubject("HAMID").claim("role", "1").setIssuedAt(date)
                .setExpiration(new Date(t + twoHours)).signWith(SignatureAlgorithm.HS256, secretKey).compact();

        System.out.println("b: " + token);
    }
}
