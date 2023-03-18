//package com.example.utils;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import lombok.Data;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
///**
// * @program: DemoSpringbootLogin
// * @description:
// * @author: Yu
// * @create: 2023-03-18 21:32
// **/
//@Data
//@Component
//@ConfigurationProperties(prefix = "xiaoyu.jwt")
//public class JwtUtils {
//    private long expire;
//    private String secret;
//    private String header;
//
//    // 生成JWT
//    public String generateToken(String username){
//        Date nowDate = new Date();
//        Date expireDate = new Date(nowDate.getTime() + 1000 * expire);
//        return Jwts.builder()
//                .setHeaderParam("typ","JWT")
//                .setSubject(username)
//                .setIssuedAt(nowDate)
//                .setExpiration(expireDate)
//                .signWith(SignatureAlgorithm.HS512,secret)
//                .compact();
//    }
//    // 解析JWT
//    public Claims getClaimsByToken(String jwt){
//        try {
//            return Jwts.parser()
//                    .setSigningKey(secret)
//                    .parseClaimsJws(jwt)
//                    .getBody();
//        }catch (Exception e){
//            return null;
//        }
//    }
//    // 判断JWT是否过期
//    public boolean isTokenExpired(Claims claims) {
//        return claims.getExpiration().before(new Date());
//    }
//
//}
