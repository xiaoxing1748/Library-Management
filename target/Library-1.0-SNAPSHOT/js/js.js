    function showbook(){
        document.getElementById("showbook").style.display = "";
        document.getElementById("showadd").style.display = "none";
	}
	function showadd(){
        document.getElementById("showbook").style.display = "none";
        document.getElementById("showadd").style.display = "";
	}
	function openupdate(){
		window.open("./update.jsp?BookId=<%=temp.getBookId() %>&BookTitle=<%=temp.getBookTitle() %>&BookInfo=<%=temp.getBookInfo() %>","_blank","toolbar=no, location=no, directories=no, status=no, menubar=yes, scrollbars=no, resizable=no, copyhistory=yes, width=250, height=350,left=200,top=200");
	}
	function opendelete(){
		window.open("./delete.jsp?BookId=<%=temp.getBookId() %>&BookTitle=<%=temp.getBookTitle() %>&BookInfo=<%=temp.getBookInfo() %>","_blank","toolbar=no, location=no, directories=no, status=no, menubar=yes, scrollbars=no, resizable=no, copyhistory=yes, width=250, height=350,left=200,top=200");
	}