public class FakeHinnottelija implements IHinnoittelija {

    private float alennus;
    public FakeHinnottelija(float alennus) {
        this.alennus = alennus;
    }

    @Override
    public float getAlennusProsentti(Asiakas asiakas, Tuote tuote) {
        return alennus;
    }

    @Override
    public void setAlennusProsentti(Asiakas asiakas, float prosentti) {

    }

    @Override
    public void aloita() {

    }

    @Override
    public void lopeta() {

    }
}
