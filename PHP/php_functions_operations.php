<?php
// AnshumanSarma_WAP to perform multiplication table, prime number check, and reverse & sum of digits using functions
?>


<!DOCTYPE html>
<html>
<head>
    <title>PHP Functions</title>
</head>
<body>

<?php
function multiplication($num)
{
    echo "<h3>Multiplication Table of $num</h3>";
    for ($i = 1; $i <= 10; $i++)
        echo "$num × $i = " . ($num * $i) . "<br>";
}

function primeNumbers($num)
{
    echo "<h3>Prime Numbers up to $num</h3>";
    for ($i = 2; $i <= $num; $i++)
    {
        $count = 0;
        for ($j = 1; $j <= $i; $j++)
        {
            if ($i % $j == 0)
                $count++;
        }
        if ($count == 2)
            echo "$i ";
    }
}

function reverseSum($num)
{
    $rev = 0;
    $sum = 0;
    while ($num > 0)
    {
        $rem = $num % 10;
        $rev = $rev * 10 + $rem;
        $sum += $rem;
        $num = (int)($num / 10);
    }
    echo "<br>Reverse = $rev";
    echo "<br>Sum of digits = $sum";
}

if (isset($_POST['num']) && isset($_POST['choice']))
{
    $num = $_POST['num'];

    if ($_POST['choice'] == "mul")
        multiplication($num);
    elseif ($_POST['choice'] == "prime")
        primeNumbers($num);
    elseif ($_POST['choice'] == "rev")
        reverseSum($num);
}
?>

<form method="post">
    Enter a number: <input type="number" name="num" required><br><br>

    <input type="radio" name="choice" value="mul" required> Multiplication Table<br>
    <input type="radio" name="choice" value="prime"> Prime Numbers<br>
    <input type="radio" name="choice" value="rev"> Reverse & Sum<br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
