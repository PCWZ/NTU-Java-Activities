package Activity5.pet;

public class Pet {
    
    private String name;
    private String breed;
    private String gender;
    private int age;
    private Boolean isVaccinated;

    public Pet(){

    }

    public Pet(String name, String breed, String gender, int age, Boolean isVaccinated){

        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isVaccinated = isVaccinated;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public void call(String sound){
        System.out.println(sound);
        System.out.println(sound);   
        System.out.println(sound);       
    }

     public void eat(String food){
        System.out.println(this.name + " loves eating " + food + ".");
             
    }

     public void sleep(){
        System.out.println(this.name + " is currently sleeping" + ".");
             
    }

}
