

public enum Die {

    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    private final Integer numberOfSidesForEnum;

    public Integer getNumberOfSidesForEnum(){
        return this.numberOfSidesForEnum;
    }

    Die(Integer numberOfSidesForEnum){
        this.numberOfSidesForEnum =numberOfSidesForEnum;
    }

    public static Die getEnumFromConstant(Integer numberOfSidesForEnum){

        Die basedOnRequestedNumOfSides;
        switch(numberOfSidesForEnum){
            case (4):
                basedOnRequestedNumOfSides = D4;
                break;
            case (6):
                basedOnRequestedNumOfSides = D6;
                break;
            case (8):
                basedOnRequestedNumOfSides = D8;
                break;
            case (10):
                basedOnRequestedNumOfSides = D10;
                break;
            case (12):
                basedOnRequestedNumOfSides = D12;
                break;
            case (20):
                basedOnRequestedNumOfSides = D20;
                break;
            case (100):
                basedOnRequestedNumOfSides = D100;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + numberOfSidesForEnum);
        }
        return basedOnRequestedNumOfSides;
    }

}
