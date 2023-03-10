interface TileSpawnLogic {
    String[] COLORS = ["R","Y","G","B","P"];
    int numOfColors;

    public void setNumOfColors(int n) {
        numOfColors = n;
    }
    public void spawn(TileMatrix board);
}
