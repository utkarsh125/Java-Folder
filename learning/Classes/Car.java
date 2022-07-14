package Classes;
/** 
 * 
*/
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //setVAR_NAME
    public void setModel(String model){
        //we got two different types of variables, that's a problem
        //we need to be specific about which one we want to update
        //we can do some more validation
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("alto")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
        //type keyword 'this' to refer to that class
        //this.model = model;//update 'this' model
    }
    //getVAR_NAME
    public String getModel(){
        return this.model;

    }
}
