fibo_recurse(){
	n=$1
	if [ $n -le 1 ]
	then 
		echo "$n"
	else
		echo $(( $(fibo_recurse $((n-1))) + $(fibo_recurse $((n-2))) ))
	fi
}

fibo_iterative(){
	n=$1
	a=0
	b=1
	if [ $n -eq  0 ]
	then
		echo $a
		return
	fi
	for ((i=2;i<=n;i++))
	do
		c=$((a+b))
		a=$b
		b=$c
	done
	echo $b
}

echo "Enter the value: "
read n
echo "using recursive function:"
value1=$(fibo_recurse $n)
echo "$n the fibonacci number is $value1"
value2=$(fibo_iterative $n)
echo "$n th fibonacci number is $value2"
