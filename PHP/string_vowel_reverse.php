<?php
// AnshumanSarma_WAP to accept a string, count the number of vowels, and display its reverse
?>

<!DOCTYPE html>
<html>
<head>
    <title>PHP String Operations</title>
</head>
<body>

<form method="post">
    Enter a string:
    <input type="text" name="fname" required>
    <br><br>
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
</form>

<hr>

<?php
if (isset($_POST["fname"]))
{
    $str = $_POST["fname"];
    echo "The string is: $str<br><br>";

    $st = strtolower($str);
    $len = strlen($st);
    $count = 0;

    for ($i = 0; $i < $len; $i++)
    {
        if ($st[$i] == 'a' || $st[$i] == 'e' || $st[$i] == 'i' || $st[$i] == 'o' || $st[$i] == 'u')
            $count++;
    }

    echo "Number of vowels: $count<br><br>";
    echo "Reverse string: " . strrev($str);
}
?>

</body>
</html>
