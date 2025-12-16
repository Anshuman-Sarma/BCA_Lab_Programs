<?php
// AnshumanSarma_WAP to check whether a number is even or odd and find its factorial
?>


<!DOCTYPE html>
<html>
<head>
  <title>PHP NUmber</title>
</head>
<body>
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
        Enter a number: <input type="text" name="num" /><br><br>
        <input type="submit" value="Submit"/><br>
        <a href="assign2a.php">Try This! </a><br>
</form>
<hr>
<?php 
if (count($_POST) > 0 && isset($_POST["num"]))
 {
    $num = $_POST["num"];
    $fact = 1;
    if($num % 2 == 0)
      echo "<br>The number " . $num.  " is Even!<br><br>";
   else
      echo "The number " . $num . " is Odd!<br><br>";
    for($i=2;$i<=$num;$i++)
       $fact *= $i;
    echo "THe factorial of " . $num . " is : " . $fact ;
 }
?>
</body>
</html>