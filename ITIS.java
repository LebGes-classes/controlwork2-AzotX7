public class ITIS extends Student{


    @Override
    public void ProgrammingWork() {
        this.rating += (int) (Math.random() * 2) + 4;
    }

    @Override
    public void ElectricalEngineeringWork() {
        this.rating += (int) (Math.random() * 2) + 3;
    }
}
