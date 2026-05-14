class A { // Fixed spelling for clarity
    private String name = "String"; // Data stays private (Encapsulation)
    
    // Change these to protected or public
    protected void setName(String name) {
        this.name = name;
    }

    protected String getName(){
        return name;
    }
}

class encpaculastion extends A {
    public static void main(String[] args) {
        encpaculastion obj1 = new encpaculastion();
        obj1.setName("Saman"); // Now this works!
        System.out.println(obj1.getName());
    }
}
