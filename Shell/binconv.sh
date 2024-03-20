echo "Enter the number to convert"
read n
b=$(echo "obase=16;ibase=10;$n" | bc)
echo "binary $b"
