<%@page import="java.util.List"%>
<%@page import="model.Proveedor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Proveedor Management</title>
</head>
<body>
    <h1>Proveedor Management</h1>
    
    <!-- Mostrar todos los proveedores -->
    <h2>Lista de Proveedores</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Dirección</th>
            <th>Teléfono</th>
        </tr>
        <% for (Proveedor proveedor : (List<Proveedor>) request.getAttribute("proveedores")) { %>
            <tr>
                <td><%= proveedor.getIdProveedor() %></td>
                <td><%= proveedor.getNombre() %></td>
                <td><%= proveedor.getDireccion() %></td>
                <td><%= proveedor.getTelefono() %></td>
            </tr>
        <% } %>
    </table>
    
    <!-- Formulario para crear un nuevo proveedor -->
    <h2>Agregar Nuevo Proveedor</h2>
    <form action="/api/proveedores" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br>
        <label for="direccion">Dirección:</label>
        <input type="text" id="direccion" name="direccion" required><br>
        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono" required><br>
        <input type="submit" value="Agregar">
    </form>
</body>
</html>
