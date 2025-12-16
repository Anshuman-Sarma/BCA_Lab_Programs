<?php
// AnshumanSarma_WAP to display even numbers between two given numbers
?>


<!DOCTYPE html>
<html>
<head>
  <title>PHP NUmber</title>
</head>
<body>
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
        Enter the first number: <input type="text" name="num1" /><br><br>
        Enter the second number: <input type="text" name="num2" /><br><br>
        <input type="submit" value="Submit"/><br>
        <a href="assign2.php">Try This! </a><br>
</form>
<hr>
<?php 
if (count($_POST) > 0 && isset($_POST["num1"]) && isset($_POST["num2"]))
 {
    $num1 = $_POST["num1"];
    $num2 = $_POST["num2"];
    echo "<br>The even numbers between " . $num1 . " and " . $num2 . " are : <br><br>";
    for($i=$num1;$i<=$num2;$i++)
      if($i% 2 == 0)
      echo  $i .  " ";
 }
?>
</body>
</html>