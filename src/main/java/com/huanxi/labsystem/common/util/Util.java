package com.huanxi.labsystem.common.util;

import org.springframework.util.DigestUtils;

public class Util {
   public static String md5sum(String s){
       String salt="labsystem_salt";
       s+=salt;
       return DigestUtils.md5DigestAsHex(s.getBytes());
   }
}
