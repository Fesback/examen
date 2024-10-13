<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Proveedor</title>
    <style>
        body {
            background-color: #f0f4f7; /* Color de fondo más claro */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            font-family: 'Arial', sans-serif;
            flex-direction: column;
        }

        h1 {
            margin-bottom: 20px;
            color: #2c3e50; /* Color del título */
            text-align: center;
            font-size: 2.5em; /* Tamaño del texto */
        }

        form {
            background-color: white;
            padding: 30px;
            border-radius: 15px; /* Bordes más redondeados */
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            transition: transform 0.3s;
        }

        form:hover {
            transform: translateY(-5px); /* Efecto al pasar el mouse */
        }

        table {
            border-spacing: 10px;
            margin: 0 auto;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 2px solid #3498db; /* Color de borde */
            border-radius: 5px;
            font-size: 1em; /* Tamaño del texto */
            transition: border-color 0.3s;
        }

        input[type="text"]:focus {
            border-color: #2980b9; /* Color al enfocar */
            outline: none; /* Sin contorno */
        }

        button {
            background-color: #3498db; /* Color de fondo del botón */
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 1em; /* Tamaño del texto */
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #2980b9; /* Color al pasar el mouse */
        }

        h2 {
            color: #e74c3c; /* Color de la sección de datos */
            margin-top: 30px;
        }

        h3 {
            margin-top: 10px;
            color: #2c3e50; /* Color del encabezado de listado */
        }

        table[border="1"] {
            width: 80%;
            margin-top: 20px;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid #2c3e50; /* Color de borde de la tabla */
            padding: 12px;
            text-align: center;
        }

        th {
            background-color: #3498db; /* Color de fondo de encabezados */
            color: white; /* Color del texto en encabezados */
        }

        tr:nth-child(even) {
            background-color: #ecf0f1; /* Color alterno para filas */
        }
    </style>
</head>
<body>
    <h1>REGISTRAR PROVEEDOR</h1>
    
    <form action="ControladorProveedor" method="post">
        <table>
            <tr>
                <td><label>Nombre:</label></td>
                <td><input type="text" name="nombre" required></td>
            </tr>
            <tr>
                <td><label>Razón Social:</label></td>
                <td><input type="text" name="razonSocial" required></td>
            </tr>
            <tr>
                <td><label>Ruc:</label></td>
                <td><input type="text" name="ruc" required></td>
            </tr>
            <tr>
                <td><label>Email:</label></td>
                <td><input type="text" name="email" required></td>
            </tr>
            <tr>
                <td><label>Fech.Ing.:</label></td>
                <td><input type="text" name="fechNac" required></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button type="submit">Registrar</button>
                </td>
            </tr>
        </table>
    </form>

    <h2>Dato Registrado en la BD</h2>

    <h3>Listado de Proveedores</h3>
    <table border="1">
        <tr>
            <th>Código</th>
            <th>Nom</th>
            <th>R.S.</th>
            <th>Ruc</th>
            <th>Email</th>
            <th>Fech</th>
        </tr>
        <tr>
            <td>6</td>
            <td>farse</td>
            <td>far s.a</td>
            <td>201120</td>
            <td>far@</td>
            <td>08/04</td>
        </tr>
        <tr>
            <td>8</td>
            <td>paner</td>
            <td>pan s.a.</td>
            <td>201478</td>
            <td>pa@</td>
            <td>05/04</td>
        </tr>
    </table>
</body>
</html>
