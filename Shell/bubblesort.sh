echo "Enter the elements"
read -a arr
n=${#arr[@]}
for ((i=0;i<n-1;i++))
do
	for ((j=i+1;j<n;j++))
	do
		if [ ${arr[i]} -gt ${arr[j]} ]
		then 
			t=${arr[i]}
			arr[i]=${arr[j]}
			arr[j]=$t
		fi
	done
done
echo "${arr[@]}"
