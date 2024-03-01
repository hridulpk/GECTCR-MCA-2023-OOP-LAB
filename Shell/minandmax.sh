echo "Element of array"
read -a arr
min=${arr[0]}
max=${arr[0]}
for i in ${arr[@]}
do 
	if [ $i -lt $min ]
	then 
		min=$i
	fi
	if [ $i -gt  $max ]
	then 
		max=$i
	fi
done
echo "Maximum element=$max"
echo "minimum element=$min"  
