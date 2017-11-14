/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author sunil*/
public class ChocoTag extends TagSupport{  

private String texture; 
public void setTexture(String texture)
{
    this.texture = texture;
}

public int doStartTag() throws JspException {  
    JspWriter out=pageContext.getOut();//returns the instance of JspWriter  
    try{    
     out.print("<br>");
     if(texture=="Chewy")
     {
         out.println("FiveStar, BarOne");
     }
     else
     {
         out.println("Munch, Kitkat");
     }
    }catch(Exception e){System.out.println(e);}  
    return SKIP_BODY;//will not evaluate the body content of the tag  
}  
}  
