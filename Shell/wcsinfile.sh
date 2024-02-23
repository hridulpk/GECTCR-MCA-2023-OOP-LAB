echo "enter the file name:"
read filename
words=$(wc -w < "$filename")
characters=$(wc -m < "$filename")
symbols=$( grep -o '[^a-zA-Z0-9[:space:]]' "$filename" | wc -l)
echo "number of words : $words"
echo "number of characters : $characters"
echo "Number of special symbols: $symbols"
