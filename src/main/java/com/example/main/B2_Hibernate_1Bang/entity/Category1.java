package com.example.main.B2_Hibernate_1Bang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category") // ten cua table lay trong SQL
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category1 {
    // mapping class Category
    // J3: JDBC => truy van tren table
    // SELECT * FROM table(SQL)
    // J4+: truy van tren thuc the - nam trong entity

    @Id // khoa chinh thi them @id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // NEU TRONG CSDL ID TU TANG MOI THEM
    private Long id;

    @Column(name = "category_code")
    private String code;

    @Column(name = "category_name")
    private String name;

}
