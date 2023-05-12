package vehicles;

public class Motorbike extends Vehicle {

    private boolean sidecar = false;

    public Motorbike(String serialNumber, int maxVelocity, EngineType engineType) {
        super(serialNumber, maxVelocity, engineType);
    }

    public Motorbike(String serialNumber, int maxVelocity, EngineType engineType, boolean sidecar) {
        super(serialNumber, maxVelocity, engineType);
        this.sidecar = sidecar;
    }

    public final boolean isSidecar() {
        return sidecar;
    }

    public final void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }
}
