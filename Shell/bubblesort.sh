echo "Enter the elements"
read -a arr
n=${#arr[@]}
for ((i=0;i<n;i++))
do
	for ((j=0;j<n-i-1;j++))
	do
		if [ ${arr[j]} -gt ${arr[j+1]} ]
		then 
			t=${arr[j]}
			arr[j]=${arr[j+1]}
			arr[j+1]=$t
		fi
	done
done
echo "${arr[@]}"
