package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(double spinSpeed, double storageCapacity, double remainingCapacity, double usedCapacity) {
        super(spinSpeed, storageCapacity, remainingCapacity, usedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD starts spinning at " + spinSpeed);
    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void store() {

    }

    @Override
    public void load() {

    }

    @Override
    public void rewrite() {

    }

    @Override
    public void reportInfo() {

    }

    @Override
    public void encoding() {

    }
    // TODO: Implement your custom interface.



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    // Add Spin Speed
    // Add Storage Capacity
    // data type in storage video

}
