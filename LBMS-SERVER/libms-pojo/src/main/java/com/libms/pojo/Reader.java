package com.libms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reader {
    private Integer rid;
    private String username;
    private String password;
    private String rname;
    private String sex;
    private Date birthday;
    private Integer phone;
}
