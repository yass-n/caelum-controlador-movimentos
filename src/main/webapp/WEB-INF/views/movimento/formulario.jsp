<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>"${movimentos.ganho}"</h3>
Data : <input type="text" name="data"/> <br/>
Oque : <input type="text" name="oque"/> <br/>
Tipo : 
<select name="tipo">
 <option>Fixo</option>
 <option>Movel 2</option>
 <option>Diario 3</option>
</select> <br/>
Valor : <input type="text" name="valor"/> <br/>
<input type="submit" value="Cadastro">
</body>
</html>