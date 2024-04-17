class Animal {

  // overridden method
  public void display(){
    System.out.println("I am an animal");
  }

  protected String type = "animal";
  
}

class Dog extends Animal {
  public String type="mammal";

  // overriding method
  @Override
  public void display(){
    System.out.println("I am a dog");
  }

  public void printMessage(){

    // this calls overriding method
    display();

    // this calls overridden method
    // super.display(); // PRIVATE ACCESS 
  }

  public void printType() {
    System.out.println("I am a " + type);
    System.out.println("I am an " + super.type);
  }
}

class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.printMessage();
    dog1.printType();
  }
}