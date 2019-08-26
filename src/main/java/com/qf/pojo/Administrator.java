package com.qf.pojo;

import lombok.Data;

@Data
public class Administrator {
    int adminid;
    String adminname;
    String adminpassword;
    final int identity=0;
}
