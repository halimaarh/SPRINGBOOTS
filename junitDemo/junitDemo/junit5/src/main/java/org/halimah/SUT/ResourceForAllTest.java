package org.halimah.SUT;

public class ResourceForAllTest {
    private String resourceName;

    public ResourceForAllTest(String resourceName){
        this.resourceName = resourceName;
        System.out.println(resourceName + " from class " + getClass().getSimpleName() + " is initializing. ");
    }

    public void close(){
        System.out.println("After all Tests are done " + resourceName + " from class " + getClass().getSimpleName() + " is closing. ");
    }
}
