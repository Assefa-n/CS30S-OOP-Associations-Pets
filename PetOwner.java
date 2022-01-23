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
    /*****************************************
    * Description: get a owner's name
    * 
    * Interface:
 
    * @return       String: owner's name
    * ****************************************/
    public String getName(){
        return name;
    }// end get name
    
    /*****************************************
    * Description: get a pet
    *               this will call on the toString() method
    *               in the pet object field
    * 
    * Interface:
 
    * @return       Pet    toString() of pet
    * ****************************************/
    public Pet getPet(){
        return pet;
    }// nend get pet
    
    //*** Setters ***
    /*****************************************
    * Description: set the name of the owner
    * 
    * Interface:
    * 
    * @param        String new name for the owner
    * ****************************************/
    public void setName(String n){
        name = n;
    }// end setName
    
    /*****************************************
    * Description: set the pet of the owner
    * 
    * Interface:
    * 
    * @param        Pet new pet for the owner
    * ****************************************/
    public void setPet(Pet p){
        pet = p;
    } // end setpet
    
    /* other methods */
    /*****************************************
    * Description: return state details about the owner
    *               include a call to pet.toString()
    * 
    * Interface:
    * 
    * @param        String new name for the pet
    * ****************************************/
    //@Override
    public String toString(){
        String st = "Name: " + name + nl;
        st += "Pet: \n" + "Name: " + this.pet.getName() + nl;
        st += "Type: " + this.pet.getType() + nl;
        
        return st;
    }
} // end of public class
