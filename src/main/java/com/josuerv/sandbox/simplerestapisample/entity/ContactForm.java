package com.josuerv.sandbox.simplerestapisample.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity for Contact Form
 * POJO method auto generation with Lombok
 *
 * @author JOSUERV99
 * @since 7/6/2022
 */
@Data
@Entity
public class ContactForm {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String phoneNumber;

    @Column(nullable = false, length = 100)
    private String subject;

    @Column(nullable = false)
    private String message;
}
