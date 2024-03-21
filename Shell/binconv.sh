echo "Enter the number to convert"
read n
echo "Enter the binary number to convert to decimal"
read k
b=$(echo "obase=2;ibase=10;$n" | bc)
c=$(echo "obase=10;ibase=2;$k" | bc)
echo "binary $b"
echo "decimal $c"
