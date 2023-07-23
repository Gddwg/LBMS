package com.libms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer bid;
    private String bname;
    private String author;
    private String publish;
    private Short status;
}
