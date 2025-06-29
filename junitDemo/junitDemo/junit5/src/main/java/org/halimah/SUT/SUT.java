package org.halimah.SUT;

public class SUT {
    private String systemName;

    public SUT (String systemName){
        this.systemName = systemName;
        System.out.println(systemName + " from class "+ getClass().getSimpleName()+ " is initializing.");
    }

    public boolean canReceiveRegularWorks(){
        System.out.println(systemName + " from class "+ getClass().getSimpleName()+ " can receive regular works ");
        return true;
    }

    public boolean canReceiveAdditionalWorks(){
        System.out.println(systemName + " from class "+ getClass().getSimpleName()+ " can receive aditional works ");
        return false;
    }

    public void close(){
        System.out.println(systemName + " from class " + getClass().getSimpleName()+ " is closing");
    }
}