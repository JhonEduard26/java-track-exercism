public class AnnalynsInfiltration {

    static boolean canFastAttack(boolean isKnightAwake){
        return !isKnightAwake;
    }

    static boolean canSpy(boolean isKnightAwake, boolean isArcherAwake, boolean isPrisonerAwake){
        return (isKnightAwake || isArcherAwake || isPrisonerAwake);
    }

    static boolean canSignalPrisoner(boolean isArcherAwake, boolean isPrisonerAwake) {
        return isPrisonerAwake && !isArcherAwake;
    }

    static boolean canFreePrisoner(boolean isKnightAwake, boolean isArcherAwake,
                                   boolean isPrisonerAwake, boolean isPetDogPresent){
        return (!isKnightAwake && !isArcherAwake && isPrisonerAwake) || (!isArcherAwake && isPetDogPresent);
    }

    public static void main(String[] args) {
        boolean isKnightAwake = true;
        boolean isArcherAwake = false;
        boolean isPrisonerAwake = false;
        boolean isPetDogPresent = true;
        System.out.println(canFreePrisoner(isKnightAwake, isArcherAwake, isPrisonerAwake, isPetDogPresent));
    }
}
