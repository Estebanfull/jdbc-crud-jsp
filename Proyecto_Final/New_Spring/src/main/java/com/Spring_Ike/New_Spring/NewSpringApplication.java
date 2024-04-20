package com.Spring_Ike.New_Spring;

import Conexion.DatabaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

@SpringBootApplication
@Import(DatabaseConfig.class) // Importar la configuración de DatabaseConfig
public class NewSpringApplication {

    public static void main(String[] args) {
        // Iniciar la aplicación Spring Boot
        ConfigurableApplicationContext context = SpringApplication.run(NewSpringApplication.class, args);
        
        // Verificar la conexión JDBC
        verificarConexion(context);
    }

    private static void verificarConexion(ConfigurableApplicationContext context) {
        try {
            DataSource dataSource = context.getBean(DataSource.class);
            Connection connection = dataSource.getConnection(); 
            System.out.println("Conexión exitosa a la base de datos.");
            // Realizar más acciones o consultas de prueba aquí si lo deseas
        } catch (SQLException e) {
            System.err.println("Error al verificar la conexión JDBC: " + e.getMessage());
        }
    }
}



