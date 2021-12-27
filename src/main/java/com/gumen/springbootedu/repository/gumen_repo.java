package com.gumen.springbootedu.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class gumen_repo {

    public SessionFactory fact;

    public gumen_repo() {
        fact = new Configuration()
                .configure("config/hibernate.cfg.xml")
                .buildSessionFactory();
    }
}
