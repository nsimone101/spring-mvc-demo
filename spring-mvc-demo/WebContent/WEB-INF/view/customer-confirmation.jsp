<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
	<head>
		<title>Customer Confirmation</title>
	</head>
	
	<body>
		Customer name: ${customer.firstName} ${customer.lastName} 
		<br><br>
		Free passes: ${customer.freePasses}
		<br><br>
		Postal Code: ${customer.postalCode}
		<br><br>
		Course Code: ${customer.courseCode}
		<br><br>
		<a href="/">Back to Main Menu</a>
	</body>
</html>