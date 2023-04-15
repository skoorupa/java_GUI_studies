package cw1.z1;

abstract class Zwierze {
    protected abstract String odglos();
    public void koncert() {
        System.out.print(this.odglos());
        for (int i = 1; i < ilePowtorzen(); i++)
            System.out.print(" "+this.odglos());
            
    }
    protected int ilePowtorzen() {return 2;}
}

