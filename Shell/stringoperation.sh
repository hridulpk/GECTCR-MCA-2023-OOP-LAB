echo "Enter the string"
read str
echo "length of string:"
echo ${#str}
l=${#str}
for((i=$l-1;i>=0;i--))
do
	rev="$rev${str:$i:1}"
done
echo "reverse of string:$rev"
echo "enter the substring:"
read sub
if echo "$str" | grep -q "$sub"
then
	echo "substring is found"
else
	echo "substring is not found"
fi 
