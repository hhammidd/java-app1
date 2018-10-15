package com.hamidApp1.service.util;

import com.hamidApp1.controller.usersGisController.aesTsete.Encryptor;

// this is the util
public class Util {
    public Util() {
    }

    public static String getJwtsSecretKey() {
        //get the key and return back the decryption
        //return Encryptor.decrypt("Bar12345Bar12345","RandomInitVector","a6660dc7d766da18042395d21cc031306fe61e0c2a7a0a92c7167566ebd8d91e");
    return "personalSecretKey";
    }
}
