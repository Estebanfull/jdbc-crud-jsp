# jdbc-crud-jsp
 el repositorio contiene código JDBC para la conexión a la base de datos, operaciones CRUD (Create, Read, Update, Delete) y un modelo en JSP.

Este proyecto es una aplicación web que implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre varias entidades (Usuarios, Proveedores, Trabajadores y Técnicos de Asistencia) 
utilizando Spring Boot(pero la conexion  si la realice  por JDBC como era lo indicado en la evidencia ) y una base de datos MySQL.

Estructura del Proyecto
El proyecto se organiza de la siguiente manera:

Conexion: Contiene la configuración de la base de datos en el archivo DatabaseConfig.java. 
---- Proyecto_Final/New_Spring/src/main/java/Conexion/DatabaseConfig.java ----

Controller: Contiene los controladores REST que manejan las solicitudes HTTP para las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) de cada entidad. 
----Proyecto_Final/New_Spring/src/main/java/controller/ProveedorController.java
Proyecto_Final/New_Spring/src/main/java/controller/TecnicoAsistenciaController.java
Proyecto_Final/New_Spring/src/main/java/controller/TrabajadorController.java
Proyecto_Final/New_Spring/src/main/java/controller/UsuarioController.java -----


NewSpringApplication.java: Clase principal que inicia la aplicación Spring Boot y verifica la conexión JDBC en el arranque.
---Proyecto_Final/New_Spring/src/main/java/com/Spring_Ike/New_Spring/NewSpringApplication.java---


Este es el esquema de la base de datos "Bd_Ike", que contiene varias tablas para almacenar información sobre usuarios, trabajadores, proveedores, técnicos de asistencia y asistencias.

Estructura de la Base de Datos
Tabla Usuario: Almacena información sobre los usuarios, incluyendo nombre, teléfono, correo electrónico, dirección, tipo de asistencia y clave de acceso.
Tabla Trabajador: Almacena información sobre los trabajadores, incluyendo nombre, teléfono y correo electrónico.
Tabla Proveedor: Almacena información sobre los proveedores, incluyendo nombre, número de contacto, correo electrónico y tipo de servicio que ofrecen.
Tabla Técnico de Asistencia: Almacena información sobre los técnicos de asistencia, incluyendo nombre, teléfono y especialidad.
Tabla Asistencia: Almacena información sobre las asistencias, incluyendo la fecha, hora, descripción, estado de la asistencia, y las claves externas que se relacionan con las tablas de Usuario, Técnico de Asistencia y Proveedor.

Para utilizar esta base de datos, primero crea una base de datos llamada "Bd_Ike" en tu sistema de gestión de bases de datos  preferido. Luego, ejecuta los scripts proporcionados para crear las tablas y definir la estructura de la base de datos.

---Proyecto_Final/Base de datos/New_Ike.sql  --- Este es la ubicacion del scripts. ---






Modelo en JSP

Permite mostrar una lista de proveedores y agregar nuevos proveedores mediante un formulario en una interfaz de usuario web.

Estructura del Proyecto

El proyecto consta de las siguientes partes:

Proveedor.java: Define la clase Proveedor, que representa un proveedor con atributos como ID, nombre, dirección y teléfono.
ProveedorService.java: Define la interfaz ProveedorService, que especifica el método para obtener todos los proveedores.
ProveedorController.java: Controlador servlet que maneja las solicitudes HTTP para mostrar la lista de proveedores y agregar nuevos proveedores.
proveedorList.jsp: Vista JSP que muestra la lista de proveedores y proporciona un formulario para agregar nuevos proveedores.

Cómo Usar
Clona este repositorio en tu máquina local:
git clone https://github.com/tu_usuario/tu_repositorio.git](https://github.com/Estebanfull/jdbc-crud-jsp.git)
Abre el proyecto en tu IDE Java preferido.
Configura la conexión a tu base de datos en el controlador ProveedorController.java según tus necesidades.
Ejecuta el proyecto en un servidor web compatible con Java (por ejemplo, Apache Tomcat).
Abre un navegador web y navega a la URL correspondiente para ver la aplicación en acción.


Tecnologías Utilizadas
Java
JDBC (Java Database Connectivity)
Servlets
JSP (JavaServer Pages)
HTML

Problema con JSP

Actualmente, estamos experimentando un problema relacionado con el procesamiento de las JavaServer Pages (JSP) en nuestra aplicación.
Al intentar visualizar el modelo me sale el erroe 404, no se si el problema esta en el url que se esta ejecutando aunque lo cambie varias veces y no logre un resultado positivo.
pero el codigo esta bien al construirlo un por uno me sale que todo esta bien.
