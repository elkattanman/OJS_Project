/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nitro
 */
public class post {
    String title ,Description , keyword ,uname , categ ,base64Image,name,state;
    Date time_stamp;
    InputStream image, pdf , dcox , html ;
    int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Date time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

    
    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
        cimage();
    }


    public String getCateg() {
        return categ;
    }
    public void setCateg(String categ) {
        this.categ = categ;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
    public post() {}

    public post(String title, String Description, String keyword, String uname, String categ, String base64Image, String name, String state, Date time_stamp, InputStream image, InputStream pdf, InputStream dcox, InputStream html, int id) {
        this.title = title;
        this.Description = Description;
        this.keyword = keyword;
        this.uname = uname;
        this.categ = categ;
        this.base64Image = base64Image;
        this.name = name;
        this.state = state;
        this.time_stamp = time_stamp;
        this.image = image;
        this.pdf = pdf;
        this.dcox = dcox;
        this.html = html;
        this.id = id;
    }


     
    public void cimage() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead = -1;

        try {
            while ((bytesRead = image.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            byte[] imageBytes = outputStream.toByteArray();
            base64Image = Base64.getEncoder().encodeToString(imageBytes);
        } 
        
        
        catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        return "post{" + "title=" + title + ", Description=" + Description + ", keyword=" + keyword + ", uname=" + uname + ", categ=" + categ + ", base64Image=" + base64Image + ", name=" + name + ", state=" + state + ", time_stamp=" + time_stamp + ", image=" + image + ", pdf=" + pdf + ", dcox=" + dcox + ", html=" + html + "}\n";
    }

  

   

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public InputStream getPdf() {
        return pdf;
    }

    public void setPdf(InputStream pdf) {
        this.pdf = pdf;
    }

    public InputStream getHtml() {
        return html;
    }

    public void setHtml(InputStream html) {
        this.html = html;
    }

    public InputStream getDcox() {
        return dcox;
    }

    public void setDcox(InputStream dcox) {
        this.dcox = dcox;
    }
    
}
