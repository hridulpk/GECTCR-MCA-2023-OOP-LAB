echo "Files with rwx permission"
for file in * ;
do
	if [ -f "$file" ];
	then
		if [ -r "$file" ] && [ -w "$file" ] && [ -x "$file" ];
		then
			echo "$file"
		fi
	fi
done

