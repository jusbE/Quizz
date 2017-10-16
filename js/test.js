function addElement(){
    var listNode = document.createElement("li");
    var itemValue = document.createTextNode("Lista objekti");
    listNode.appendChild(itemValue);
    document.getElementById("myDiv").appendChild(listNode);
}