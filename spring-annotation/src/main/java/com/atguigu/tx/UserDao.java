package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author k
 * @create 2021-09-27 22:02
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        String sql = "INSERT INTO `test`.`tbl_user` (`username`, `age`) VALUES (?, ?); ";
        String substring = UUID.randomUUID().toString().substring(0, 5);
        jdbcTemplate.update(sql, substring, 19);
    }

}
