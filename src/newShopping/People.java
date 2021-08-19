package newShopping;

public class People {
    private String id;
    private String name;
    private String registration_time;
    private String phoneNumber;
    private String mail;
    private String password;
    private boolean root;

    boolean checkNumber(String Number){
        for(int i=0;i<Number.length();i++){
            if(!Character.isDigit(Number.charAt(i))){
                return false;
            }
        }
        return true;
    }

    void setPhoneNumber(String PhoneNumber){
        if(checkNumber(PhoneNumber)){
            this.phoneNumber=PhoneNumber;
        }else{
            throw new MyException("wrong Phone NUmber!");
        }
    }

    void setId(String ID){
        this.id=ID;
    }

    void setName(String name){
        this.name=name;
    }

    void setRegistration_time(String time){
        this.registration_time=time;
    }

    void setMail(String mail){
        this.mail=mail;
    }

    void setPassword(String password){
        this.password=password;
    }

    void setRoot(boolean root){
        this.root=root;
    }

    boolean isRoot(){
        return this.root;
    }

    String getName(){
        if(this.name.isEmpty()){
            throw new MyException("please set name first!");
        }else{
            return this.name;
        }
    }

    String getId(){
        if(this.id.isEmpty()){
            throw new MyException("please set id first!");
        }else{
            return this.id;
        }
    }

    String getRegistration_time(){
        if(this.registration_time.isEmpty()){
            throw new MyException("please set registration time first!");
        }else{
            return this.registration_time;
        }
    }

    String getPhoneNumber(){
        if(this.phoneNumber.isEmpty()){
            throw new MyException("please set phone number first!");
        }else{
            return this.phoneNumber;
        }
    }

    String getMail(){
        if(this.mail.isEmpty()){
            throw new MyException("please set mail first!");
        }else{
            return this.mail;
        }
    }

    String getPassword(){
        return this.password;
    }
}
