<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Library</title>
<style>
	.container {
		border: 1px solid black;
		padding: 20px;
	}
</style>
</head>
<body>
	<div class="container">
		<h3>Retrieve Operation</h3>
		<form action="book-retrieve" method="post">
			Book Id: <input type="text" id="bookId" name="bookId"> <input
				type="submit" value="search">

		</form>
		<hr>
		<br>
		<h3>Book Retrieved Details Here</h3>
		Book Id: ${book.bookId} <br> Book Name: ${book.bookName}<br> Book
		Price: ${book.bookPrice}<br>
	</div>
	
	<br><br><br>
	
	<div class="container">

		<h3>Insert Operation</h3>
		<form action="book-insert" method="post">
			Book Id: <input type="text" id="bookId" name="bookId"><br>
			<br> Book Name: <input type="text" id="bookName" name="bookName"><br>
			<br> Book Price: <input type="text" id="bookPrice"
				name="bookPrice"><br>
			<br> <input type="submit" value="save"><br>
			<br>
		</form>
		<h3>Status</h3>
		${msg}

	</div>
	
	
	
</body>
</html>