class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{ 0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int element: birdsPerDay) {
            if (element == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;
        if (numberOfDays >= 7) {
            numberOfDays = 7;
        }
        for (int i = 0; i < numberOfDays; i++) {
            result += birdsPerDay[i];
        }
        return result;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int element: birdsPerDay) {
            if (element >= 5){
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
