package com.spring.project;

import com.spring.project.admin.AssignRepository;
import com.spring.project.admin.ManagementPage;
import com.spring.project.issues.IssueRepository;
import com.spring.project.student.StudentPage;
import com.spring.project.student.StudentRepository;
import com.spring.project.worker.WorkerPage;
import com.spring.project.worker.WorkerRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Application {

    Dotenv dotenv= Dotenv.load();

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(dotenv.get("DRIVER_PROJECT"));
        ds.setUrl(dotenv.get("URL_PROJECT"));
        ds.setUsername(dotenv.get("USER"));
        ds.setPassword(dotenv.get("PASSWORD"));
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public StudentRepository studentRepository(){
        return  new StudentRepository(jdbcTemplate());
    }


    @Bean
    public IssueRepository issueRepository() {
        return new IssueRepository(jdbcTemplate());
    }

    @Bean
    public AssignRepository assignRepository() {
        return new AssignRepository(jdbcTemplate());
    }

    @Bean
    public WorkerRepository workerRepository(){
        return new WorkerRepository(jdbcTemplate());
    }

    @Bean
    public StudentPage studentPage(){
        return new StudentPage(studentRepository(),issueRepository());
    }

    @Bean
    public WorkerPage workerPage() {
        return new WorkerPage(workerRepository());
    }

    @Bean
    public ManagementPage managerPage() {
        return new ManagementPage(assignRepository(),workerRepository(),issueRepository());
    }
}
