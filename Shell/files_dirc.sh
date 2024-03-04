echo "list of directories"
find $1 -type d
echo " "
echo "number of directories:"
echo $1 -type d|wc -l
echo " "
echo "list of files:"
find $1 -type f
echo " "
echo "number of files:"
find $1 -type f|wc -l
