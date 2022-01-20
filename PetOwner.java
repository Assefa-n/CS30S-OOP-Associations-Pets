/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: OOP Association example 2
 *
 * Description: Owner class for the Pet and PetOwner project
 ***********************************************************************/

// import libraries as needed here

public class PetOwner {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    // a new line character that works on every computer system
    private String nl = System.lineSeparator();
    
    private String name;
    
    private Pet pet;
    
    //*** Constructors ***
    
    public PetOwner(String n){
        name = n;
    }//end constructor
    
    
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
    }// end get name
    
    public Pet getPet(){
        return pet;
    }// nend get pet
    
    //*** Setters ***
    
    public void setName(String n){
        name = n;
    }// end setName
    
    public void setPet(Pet p){
        pet = p;
    } // end setpet
    
    /* other methods */
    //@Override
    public String toString(){
        String st = "Name: " + name + "\n";
        st += "Pet: \n" + this.pet.toString() + "\n";
        
        return st;
    }
} // end of public class
