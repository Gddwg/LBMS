package com.libms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lend {
    private Integer lid;
    private String  rname;
    private String  bname;
    private Date    lendDate;
    private Date    backDate;
    private Short   lendStatus;
    private String remark;
}
