public class Lasagna {

    int expectedMinutesInOven() { return 40; }

    int remainingMinutesInOven(int minutesElapsed) {
        if (minutesElapsed > 40) return 0;
        if (minutesElapsed < 0) return 40;
        return expectedMinutesInOven() - minutesElapsed;
    }

    int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    int totalTimeInMinutes(int minutesElapsed, int layers) {
        return minutesElapsed + preparationTimeInMinutes(layers);
    }
}
