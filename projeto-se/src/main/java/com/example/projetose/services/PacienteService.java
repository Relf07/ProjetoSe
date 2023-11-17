package com.example.projetose.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class PacienteService {
    private static final String PASSWORD_REGEX = "^(?=.*[a-zA-Z]).{6,}$";
     private static final Pattern pattern = Pattern.compile(PASSWORD_REGEX);

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

}
