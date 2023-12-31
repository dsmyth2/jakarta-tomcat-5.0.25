<!-- ComputeFactorial.jsp -->
<html>
  <head>
    <title>
      ComputeFactorial
    </title>
  </head>
  <body>
    <%@ page import = "java.text.*" %>
	<%@ page errorPage = "FactorialInputError.jsp" %>
	

	
    <% NumberFormat format = NumberFormat.getNumberInstance();
       int number =
         Integer.parseInt(request.getParameter("number")); %>
       Factorial of <%= number %> is
    <%= format.format(computeFactorial(number)) %>

    <%! private long computeFactorial(int n) {
          if (n == 0)
            return 1;
          else
            return n * computeFactorial(n - 1);
        }
    %>
  </body>
</html>

