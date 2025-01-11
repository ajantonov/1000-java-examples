public interface SharkFamily extends HasFins {
    public default int getNumberOfFins() {
        return 8;
    }
    public double getLongestFinLength();
    public default boolean doFinishHaveScales() {
        return false;
    }
}
