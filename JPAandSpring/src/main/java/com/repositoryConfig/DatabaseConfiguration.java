package com.repositoryConfig;

import org.springframework.beans.factory.annotation.Value;

/*NOTE: DO NOT USE THIS CLASS IN CASE OF XML CONFIGURATION THROUGH dispatcherServlet-servlet.xml
 *	IT WILL BE USED IN CASE OF ANNOTATION CONFIGURATION 
 */

/*@Component
@PropertySource(value = { "classpath:webapp/WEB-INF/messages/database.properties" })*/
public class DatabaseConfiguration {
	
	@Value("${spring.datasource.driver}")
	public String driver;
	
	@Value("${spring.datasource.url}")
	public String url;
	
	@Value("${spring.datasource.username}")
	public String username;
	
	@Value("${spring.datasource.password}")
	public String password;
	
	@Value("${spring.jpa.show-sql}")
	public String HIBERNATE_SHOW_SQL;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	public String HIBERNATE_HBM2DDl_AUTO;
	
	@Value("${spring.jpa.properties.hibernate.dialect}")
	public String HIBERNATE_DIALECT;
	
	/*@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
	    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
	    propertySourcesPlaceholderConfigurer.setLocation(new ClassPathResource("some.properties"));
	    return propertySourcesPlaceholderConfigurer;
	}*/
}
