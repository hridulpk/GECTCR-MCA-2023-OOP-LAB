echo "Enter your basic salary:"
read basic
if [ $basic -lt 15000 ];
then
	 hra=$(($basic * 10/100))
	 echo "HRA=$hra"
	 da=$(($basic * 95/100))
	 echo "DA=$da"
else
	hra=1500
	echo "HRA=$hra"
	da=$(($basic * 96/100))
	echo "DA=$da"
fi
