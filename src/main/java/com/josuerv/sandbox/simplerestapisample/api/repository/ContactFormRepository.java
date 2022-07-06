package com.josuerv.sandbox.simplerestapisample.api.repository;

import com.josuerv.sandbox.simplerestapisample.entity.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@RepositoryRestController
public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {

    Collection<ContactForm> findByNameContaining(final String keyword);

    Collection<ContactForm> findByMessageContaining(final String keyword);

}
