

public enum Die {

    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    private final Integer numberOfSides;

    public Integer getNumberOfSides(){
        return this.numberOfSides;
    }

    Die(Integer numberOfSides){
        this.numberOfSides =numberOfSides;
    }
}
