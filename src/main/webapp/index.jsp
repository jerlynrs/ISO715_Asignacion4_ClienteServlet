<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Registro de Cliente</title>
  <style>
    body { font-family: Arial, sans-serif; background: #f4f4f9; display: flex; justify-content: center; align-items: center; height: 100vh; }
    .container { background: white; padding: 25px; border-radius: 15px; box-shadow: 0 8px 20px rgba(0,0,0,0.2); width: 350px; }
    h1 { text-align: center; color: #333; }
    input, select { width: 100%; padding: 10px; margin: 8px 0; border: 1px solid #ccc; border-radius: 8px; }
    button { width: 100%; padding: 10px; background: #007bff; border: none; border-radius: 8px; color: white; font-size: 16px; cursor: pointer; }
    button:hover { background: #0056b3; }
  </style>
</head>
<body>
<div class="container">
  <h1>Registro Cliente</h1>
  <form action="cliente" method="post">
    <input type="text" name="id" placeholder="ID" required>
    <input type="text" name="nombre" placeholder="Nombre" required>
    <select name="categoria" required>
      <option value="">Seleccione categoria</option>
      <option value="Regular">Regular</option>
      <option value="Premium">Premium</option>
      <option value="VIP">VIP</option>
    </select>
    <input type="text" name="direccion" placeholder="Direccion" required>
    <button type="submit">Guardar</button>
  </form>
</div>
</body>
</html>
