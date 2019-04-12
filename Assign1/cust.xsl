<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
   <xsl:template match = "/">
                         
                          <html>
                          <body>
                                <table border="1">
                                	<tr>
                                		<td>Name</td>
                                		<td>Address</td>
                                		<td>Gender</td>
                                		<td>Language</td>
                                		<td>City</td>
                                	</tr>
                                    
                                    <xsl:for-each select="customer">
  										<tr>
  											<td><xsl:value-of select="name"/></td>
  											<td><xsl:value-of select="address"/></td>
  											<td><xsl:value-of select="gender"/></td>
  											<td><xsl:value-of select="language"/></td>
  											<td><xsl:value-of select="city"/></td>
  										</tr>			
                                </xsl:for-each>

                                </table> 
                          </body>
                          </html>   

   </xsl:template>
</xsl:stylesheet>