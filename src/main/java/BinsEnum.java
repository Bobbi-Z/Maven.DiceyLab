

public enum BinsEnum {

    binD4(Die.D4),
    binD6(Die.D6),
    binD8(Die.D8),
    binD10(Die.D10),
    binD12(Die.D12),
    binD20(Die.D20),
    binD100(Die.D100);

    private final Die dieForEnum;

    BinsEnum(Die dieForEnum) {
        this.dieForEnum = dieForEnum;
    }

    public Die getBinValueOfEnum(){
        return this.dieForEnum;
    }

    





}
