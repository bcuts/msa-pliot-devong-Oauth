package com.sds.oAuth.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue
    long id;
    String name;
    String userName;
    String remark;

    public Member() {
    }

    public Member(String name, String username, String remark) {
        this.name = name;
        this.userName = username;
        this.remark = remark;
    }
}
