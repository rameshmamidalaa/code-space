/**
 * 
 */
package com.hibernatedemo.sample.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ramesh_Mamidala
 *
 */
@Slf4j
public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		log.info("I am in HibernateUtil::::");
		if(sessionFactory == null) {
			// loads configuration and mappings
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
			        .configure( "hibernate.cfg.xml" )
			        .build();

			        Metadata metadata = new MetadataSources( standardRegistry )
			        .getMetadataBuilder()
			        .build();

			        return metadata.getSessionFactoryBuilder().build();
		}
		return sessionFactory;
	}

}
