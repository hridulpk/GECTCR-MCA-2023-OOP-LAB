echo "enter no.of user to add"
read n
for (( i=0;i<n;i++ ))
do
	echo "enter username"
	read temp
	sudo useradd "$temp"
	sudo passwd "$temp"
done
