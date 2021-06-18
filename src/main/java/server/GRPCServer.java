package server;

import entity.User;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import repository.UserRepository;
import service.UserService;

import java.io.IOException;

@SpringBootApplication

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class GRPCServer {



    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(GRPCServer.class,args);



        Server server = ServerBuilder.forPort(9091).addService((BindableService) new UserService()).build();

        server.start();
        System.out.println("Server started on " + server.getPort());
        server.awaitTermination();
    }
}
