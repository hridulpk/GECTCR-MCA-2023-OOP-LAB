#echo "Enter the binary number:"
#read binary;
str="";
echo "Enter the decimal number";
read decimal;
while [ $decimal -gt 0 ]
do  
  num=$(( $decimal%2 ));
  str=$str$num;
  decimal=$(($decimal/2 )); 
done
final=$(echo "$str" | rev);
echo "Decimal to binary: $final";

