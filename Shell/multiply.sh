echo "enter the number"
read number
echo "Multiplication table of $number:"
for i in 1 2 3 4 5 6 7 8 9 10
do
	result=`expr $number \* $i`
	echo "$i * $number=$result"
done
