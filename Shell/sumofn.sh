sum=0
for num in "$@"
do
 sum=$((sum+num))
done
echo "summ of numbers:$sum"
