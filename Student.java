public abstract class Student {
    int rating = 0;
    public abstract void ProgrammingWork();

    public abstract void ElectricalEngineeringWork();

    public void outputRating(){
        System.out.println("Лучший рейтинг: " + rating);
    }
}

