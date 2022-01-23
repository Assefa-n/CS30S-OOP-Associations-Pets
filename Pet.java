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
    /*****************************************
    * Description: get a pet's name
    * 
    * Interface:
 
    * @return       String: pet's name
    * ****************************************/
    public String getName(){
        return name;
    }// end getName
    
    /*****************************************
    * Description: get the type of pet i.e cat, dog, goldfish
    *               Note: We'll come back to this later to see
    *               how we can create a custom type to limit the 
    *               domain of possible values for type of pet
    * 
    * Interface:
 
    * @return       String: type of pet
    * ****************************************/
    public String getType(){
        return type;
    }// end gettype
    
    /*****************************************
    * Description: get a pet's owner
    *               this will call on the toString() method
    *               in the owner object field
    * 
    * Interface:
 
    * @return       PetOwner    toString() of owner
    * ****************************************/
    public PetOwner getOwner(){
        return owner;
    } // end getOwner
    
    //*** Setters ***
    
    /*****************************************
    * Description: set the name of the pet
    * 
    * Interface:
    * 
    * @param        String new name for the pet
    * ****************************************/
    public void setName(String n){
        name = n;
    } // end setName
    
    /*****************************************
    * Description: set the pet type of the pet
    * 
    * Interface:
    * 
    * @param        String new type of pet
    * ****************************************/
    public void setType(String t){
        type = t;
    } //end setTuype
    
    /*****************************************
    * Description: set the owner of the pet
    * 
    * Interface:
    * 
    * @param        PetOwer new owner for the pet
    * ****************************************/
    public void setOwner(PetOwner o){
        owner = o;
    } // end setOwner
    
    /* *** other methods *** */
    /*****************************************
    * Description: return state details about the pet
    *              uses StringBuilder to construct the 
    *              record then return the toString of the 
    *              StringBuilder object
    * 
    * Interface:
    * 
    * @param        String new name for the pet
    * ****************************************/
    @Override
    public String toString(){
        StringBuilder pst = new StringBuilder();
        pst.append("Type: " + type +  nl);
        pst.append("Name: " + name + nl);
        //pst.append("Owner: " + owner + nl);
        pst.append("Owner: " + this.owner.getName() +  nl);
        
        return pst.toString();
    }// end toString
    
} // end of public class
