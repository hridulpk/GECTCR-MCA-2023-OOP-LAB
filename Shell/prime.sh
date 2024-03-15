prime_check(){
	num=$1
	for ((i=2;i<num;i++))
	do
		if [ $((num%i)) -eq 0 ]
		then
			flag=1
			break
		fi
		done
		if [ $num -eq 1 ]
		then 
			echo "1 is neither prime nor composite"
		elif [ "$flag" != "1"  ]
		then 
			echo "$num is prime number"
		else 
			echo "$num is not prime number"
		fi
		}
	echo "enter the number"
	read number
	prime_check $number
