echo "Enter the file"
read file
echo "enter the word"
read word
grep -v "$word" "$file" > file2
cat file2 > "$file"
