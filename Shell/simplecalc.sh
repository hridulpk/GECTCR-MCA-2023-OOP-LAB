br=0
while [ $br -eq 0 ];
do
 echo "Select operators:"
 echo "1.Addition"
 echo "2.Substraction"
 echo "3.Multiplication"
 echo "4.Division"
 read choice
 read num1
 read num2
 case $choice in 
 	1)res=`echo $num1 + $num2 | bc`;;
 	2)res=`echo $num1 - $num2 | bc`;;
 	3)res=`echo $num1 \* $num2 | bc`;;
 	4)if [ $num2 -eq 0 ];
 	  then
 	  	echo "Division by zero"
 	  else 
 	  	res=`echo "scale=2; $num1 / $num2" | bc`
 	  fi;;
 	*)echo "Wrong input";;
 esac
 echo "result $res"
 echo "To continue type 0"
 read br
done
