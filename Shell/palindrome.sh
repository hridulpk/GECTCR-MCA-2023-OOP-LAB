palindrome_check(){
	str="$1"
	revstr=""
	for ((i=${#str};i>=0;i--))
	do
		revstr="$revstr${str:$i:1}"
	done
	echo "$revstr"
	if [ "$str" == "$revstr" ]
	then
		echo "$str is palindrome"
	else
		echo "$str is not palindrome"
	fi
}
echo "Enter the string:"
read string
palindrome_check "$string"
