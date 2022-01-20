/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: OOP Association example 2
 *
 * Description: pet calss for the Pet and Pet Owner project
 ***********************************************************************/

// import libraries as needed here

public class Pet {
    //*** Class Variables ***
    // a new line character that works on every computer system
    private String nl = System.lineSeparator();
    
    //*** Instance Variables ***
    
    private String name;
    private String type;
    
    private PetOwner owner;
    
    //*** Constructors ***
    
    public Pet(String n, String t){
        name = n;
        type = t;
    } //end constructor
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    
    public String getName(){
        return name;
    }// end getName
    
    public String getType(){
        return type;
    }// end gettype
    
    public PetOwner getOwner(){
        return owner;
    } // end getOwner
    
    //*** Setters ***
    
    public void setName(String n){
        name = n;
    } // end setName
    
    public void setType(String t){
        type = t;
    } //end setTuype
    
    public void setOwner(PetOwner o){
        owner = o;
    } // end setOwner
    
    /* *** other methods *** */
    @Override
    public String toString(){
        StringBuilder pst = new StringBuilder();
        pst.append("Type: " + type +  " \n");
        pst.append("Name: " + name + "\n");
        //pst.append("Owner: " + this.owner.getName() +  " \n");
        
        return pst.toString();
    }// end toString
    
} // end of public class
