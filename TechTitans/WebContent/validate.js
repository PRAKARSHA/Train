function validate(){
	var x1=document.getElementsByName("email");
	if( x1==null || x=" "){
		alert("Enter  mailId");
		return false;}

	var x2=document.getElementsByName("qua");
	if(x2==" " || x2==null){
		alert("Enter qualifica");
	return false;
	}}	