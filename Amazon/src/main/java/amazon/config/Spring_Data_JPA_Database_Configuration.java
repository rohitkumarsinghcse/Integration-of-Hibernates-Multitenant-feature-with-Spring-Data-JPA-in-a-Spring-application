package amazon.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories("amazon.*")
public class Spring_Data_JPA_Database_Configuration 
{
						@Bean
						public DriverManagerDataSource getDataSource()
						{
								DriverManagerDataSource dataSource = new DriverManagerDataSource();
								dataSource.setUrl("jdbc:mysql://localhost:3306/spring-database");
								dataSource.setUsername("root");
								dataSource.setPassword("coder");
		
							return dataSource;
						}
	
						Properties hibernateProperties()
						{
							Properties hibernateProperties = new Properties();
							hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
							
							//This is for printing internally genearted SQL Quries
							hibernateProperties.setProperty("hibernate.show_sql", "true");
							
							return hibernateProperties;
						}
	
						@Bean("entityManagerFactory")
						LocalContainerEntityManagerFactoryBean  createEntityManagerFactoryBean()
						{
								LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		
								// 1. Set DataSource Object // DB details
								factory.setDataSource(getDataSource());
		
								//2. Provide Package information of entity classes
								factory.setPackagesToScan("amazon.*");
		
								//3. Providing Hibernate Details to EM
								factory.setJpaProperties(hibernateProperties());
		
								// 4. Passing predefine Hibernate Adapter Object EM
		
								HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
								factory.setJpaVendorAdapter(adapter);
		 
								return factory;
						}
	
						@Bean("transactionManager")
						public PlatformTransactionManager createTransactionManager()
						{
								JpaTransactionManager transactionManager = new JpaTransactionManager();
								transactionManager.setEntityManagerFactory(createEntityManagerFactoryBean().getObject());
				
								return transactionManager;
						}
}
