echo "Enter the password:"
read pass
if [ ${#pass} -lt 8 ];
then
	echo "Weak password:should have atleast of 8 character"
elif ! [[ "$pass" =~ [[:alpha:]] && "$pass" =~ [[:digit:]] ]];
then
	echo "Weak password:should have alphabets and digits"
elif ! [[ "$pass" =~ [[:upper:]] && "$pass" =~ [[:lower:]] ]];
then
	echo "Weak password:should have upper and lower case lettes"
else
	echo "password is strong"
fi
