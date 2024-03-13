echo "currently logged user and his log name:"
user=$(whoami)
logname=$(logname)
echo "$user is the username"
echo "$logname is the logname"
echo "current shell"
echo "$SHELL"
echo "home directory"
echo "$HOME"
echo "OS type"
echo "$(uname)"
echo "current path setting:"
echo $PATH
echo "current working directory"
present=$(pwd)
echo "$present"
echo "no.of currently working logged users:"
users | wc -w
