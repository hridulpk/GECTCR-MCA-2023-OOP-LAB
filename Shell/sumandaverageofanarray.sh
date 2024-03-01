echo "Enter the elements of an array"
read -a array
s=0;
l=${#array[*]}
for i in ${array[*]}
do 
	s=$((s+i))
done
echo "length=$l"
echo "Sum=$s"
avg=$(( s/l ))
echo "average=$avg"

