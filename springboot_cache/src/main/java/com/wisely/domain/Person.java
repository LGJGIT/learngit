package com.wisely.domain;

import javax.persistence.*;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description:
 * @Date Created in 下午2:06 17/6/20
 */

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    private Integer age;
    private String address;
}
