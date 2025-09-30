<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Terminators</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <h1>Terminators Almacenados</h1>
    </header>
    <main>
        <div class="terminators-list">
            <a href="terminators?action=create" class="button">Crear Nuevo Terminator</a>
            <table id="terminator-table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Modelo</th>
                        <th>Descripción</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="terminator" items="${terminators}">
                        <tr>
                            <td><c:out value="${terminator.id}"/></td>
                            <td><c:out value="${terminator.model}"/></td>
                            <td><c:out value="${terminator.description}"/></td>
                            <td class="action-buttons">
                                <a href="terminators?action=edit&id=<c:out value="${terminator.id}"/>" class="edit-btn">Editar</a>
                                <a href="terminators?action=delete&id=<c:out value="${terminator.id}"/>" class="delete-btn" onclick="return confirm('¿Estás seguro de que quieres eliminar este Terminator?');">Eliminar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <c:if test="${empty terminators}">
                <p>No hay Terminators registrados.</p>
            </c:if>
        </div>
    </main>
    <footer>
        <p>&copy; 2025 Skynet - CRUD JSP</p>
    </footer>
</body>
</html>