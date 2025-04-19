public enum DaysWekend {
    SUNDAY(null),
    SATURDAY(SUNDAY),
    FRIDAY(SATURDAY),
    THURSDAY(FRIDAY),
    WEDNESDAY(THURSDAY),
    TUESDAY(WEDNESDAY),
    MONDAY(TUESDAY);


    private final DaysWekend next;

    DaysWekend(DaysWekend next) {
        this.next = next;
    }

    public DaysWekend next() {
        return this.next == null ? MONDAY : this.next;
    }
}