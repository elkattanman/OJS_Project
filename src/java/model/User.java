package model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {

    String uname, pass, name, email, cid, phone, gender, type, base64Image;

    Date DOB;
    InputStream image, cv;
    
    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
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
        return "User{" + "uname=" + uname + ", pass=" + pass + ", name=" + name + ", email=" + email + ", cid=" + cid + ", phone=" + phone + ", gender=" + gender + ", type=" + type + ", DOB=" + DOB + ", image=" + image + ", cv=" + cv + '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setImage(InputStream image) {
        this.image = image;
        cimage();
    }

    public void setCv(InputStream cv) {
        this.cv = cv;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public InputStream getImage() {
        return image;
    }

    public InputStream getCv() {
        return cv;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

}
