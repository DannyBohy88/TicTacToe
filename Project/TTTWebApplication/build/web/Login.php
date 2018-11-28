<html>
<head>
<title></title>
</head>
<body>
<form action='login.php' method='GET'>
	Username: 
	<input type='text' name='user'><br />
	Password:
	<input type='text' name='pass'><br />
	<input type='Submit' name='Submit' value='submit'>
</form>
</body>
</html>
<?php 
//require ('config.php');

session_start();
if(isset($_GET['user'])&& isset($_GET['pass'])){
$wsdl = 'http://localhost:8080/TTTWebApplication/TTTWebService?WSDL';
$user = $_GET["user"];
$pass = $_GET["pass"];
try{
$client = new SoapClient($wsdl, array('username' => $user, 'password' => $pass));

$result = $client->__soapCall('login', array('parameters' => $params));

print_r($result);
$intresult = $result.PHP_EQL;
if($intResult > 0){
echo "success";
}else{
echo "fail";
}
} catch (Exception $e) {
		echo $e->getMessage();
	}
}



?>
