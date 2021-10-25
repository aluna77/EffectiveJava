package sandwich;

public final class Table {
    private int guestCount;

    private Table (int guestCount) {
        this.guestCount = guestCount;
    }
    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public static Table valueOf(int guestCount) {
        return new Table(guestCount);
    }
}
