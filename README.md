# Request ,Reponse and Thread Objects

## Web container craete 3 objects regurding the HTTP Request! 
 * To check this process , check by running the com/A.
```Java
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request + ":" + response+":"+Thread.currentThread().getName());
        
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }
```
