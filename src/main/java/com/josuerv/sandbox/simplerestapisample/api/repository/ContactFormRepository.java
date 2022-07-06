package com.josuerv.sandbox.simplerestapisample.api.repository;

import com.josuerv.sandbox.simplerestapisample.entity.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Collection;

/**
 * Contact Form Repository
 * Using JPA for query data from database
 * Using Repository rest controller to create a HAL based endpoint for CRUD handling
 * Using custom methods to do SQL search queries
 *
 * @author JOSUERV99
 * @since 7/6/2022
 */
@RepositoryRestController
public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {

    Collection<ContactForm> findByNameContaining(final String keyword);

    Collection<ContactForm> findByMessageContaining(final String keyword);

}
