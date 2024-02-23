echo "enter the folder"
read folder
find "$folder" -empty -type d -delete
