package co.clarap.al.allPatternDesign.estructural.adapter.v1;

//Adapter:Wrapper
public class ElectricAcousticGuitar implements Guitar{
    AcousticGuitar acoustic = new AcousticGuitar();
    @Override
    public void onGuitar() {
        acoustic.play();
    }

    @Override
    public void offGuitar() {
        acoustic.leaveGuitar();        
    }
    
}
