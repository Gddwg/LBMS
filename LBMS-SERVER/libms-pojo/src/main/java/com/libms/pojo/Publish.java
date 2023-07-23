package com.libms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publish {
    private Integer pid;
    private String pname;
    private String paddress;
    private Integer phone;
}
