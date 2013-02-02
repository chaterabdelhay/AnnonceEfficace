var t ;
function showOptionDescriptor( element) 
{
	var optionDescription = document.getElementById( element.parentNode.id + "Description").innerHTML;
	//alert(element.parentNode.id);
	document.getElementById("optionDescriptorText").innerHTML = "<nobr>" + optionDescription + "</nobr>";
	var optionDescriptor  = document.getElementById("optionDescriptor");	
	optionDescriptor.style.display = "block";
	
	var optionItem = document.getElementById(element.parentNode.id);
	//alert(optionItem.id);
	optionDescriptor.style.top  = (getY(optionItem) + 10) + "px";
	optionDescriptor.style.left = (getX(optionItem) + 48) + "px";
	clearTimeout(t);
}

function hideOptionDescriptor() 
{
	var optionDescriptor  = document.getElementById("optionDescriptor");
	optionDescriptor.style.display = "none";
}

function timedOuthideOptionDescriptor() 
{
	t = setTimeout("hideOptionDescriptor()",400);
}

// ------------- Get element coordonates ------------------------//
function getY( oElement )
{
	var iReturnValue = 0;
	while( oElement != null ) {
		iReturnValue += oElement.offsetTop;
		oElement = oElement.offsetParent;
	}
	return iReturnValue;
}
function getX( oElement )
{
	var iReturnValue = 0;
	while( oElement != null ) {
		iReturnValue += oElement.offsetLeft;
		oElement = oElement.offsetParent;
	}
	return iReturnValue;
}