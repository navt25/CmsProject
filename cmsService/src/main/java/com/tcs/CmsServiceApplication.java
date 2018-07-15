package com.tcs;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication(scanBasePackages = {"com"} , exclude = {JpaRepositoriesAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class CmsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsServiceApplication.class, args);
	}
	
	/*@Bean(name = "devSessionFactory")
	public HibernateJpaSessionFactoryBean devSessionFactory(EntityManagerFactory emf) {
		HibernateJpaSessionFactoryBean sessionFactory = new HibernateJpaSessionFactoryBean();
		sessionFactory.setEntityManagerFactory(emf);
		return sessionFactory;
	}*/
	
	/*@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
	    return new HibernateJpaSessionFactoryBean();
	}*/
	
	
}
