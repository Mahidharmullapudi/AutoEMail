
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Email</title>
        <script>
            funtion validate(){
                var x = document.forms[0]["toAddress"].value;
                var y = document.forms[0]["subject"].value;
                    if(x== null || x=="" || y==null || y=="" ){
                        alert("Fields must be filled.");
                        return false;
                    }
                }
        </script>
    </head>
    <body>
        
        <h2>Want to send Email! Enter information below</h2>
        <form name="emailInfo" action="EmailServlet" onsubmit=" return validate()">
            <table>
                <tr><td>
                 To:
                    </td>
                    <td>
                        <input type="text" name="toAddress"/>
                    </td>
                </tr>
                <tr><td>
                 Subject:
                    </td>
                    <td>
                        <input type="text" name="subject"/>
                    </td>
                </tr>
                <tr><td>
                 Message:
                    </td>
                    <td>
                        <textarea rows="10" cols="70" name="msg"></textarea>
                    </td>
                </tr>
                <input type="submit" value="Send"/>
            </table>
         </form>
        
    </body>
</html>
