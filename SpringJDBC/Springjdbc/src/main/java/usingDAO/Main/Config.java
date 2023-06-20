package usingDAO.Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import usingDAO.StudentDAO;
import usingDAO.StudentDAOIMPL;
@Configuration
@ComponentScan(basePackages = {"usingDAO"})
public class Config {
	@Bean("A1")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource A1=new DriverManagerDataSource();
		A1.setDriverClassName("org.postgresql.Driver");
		A1.setUrl("jdbc:postgresql://localhost:5432/SpringJDBC");
		A1.setUsername("postgres");
		A1.setPassword("root");
		return A1;
	}
	@Bean("temp")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate temp = new JdbcTemplate();
		//using driverManager reference
		temp.setDataSource(getDataSource());
		return temp;
	}
	
}
