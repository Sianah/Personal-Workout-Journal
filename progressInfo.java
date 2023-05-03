public class progressInfo {
    private String mDayNumba;
    private String mNotes;

    public String getmDayNumba() {
        return this.mDayNumba;
    }
    public void setmDayNumba(String mDayNumba) {
        this.mDayNumba = mDayNumba;
    }

    public String getmNotes() {
        return this.mNotes;
    }

    public void setmNotes(String mNotes) {
        this.mNotes = mNotes;
    }
    public progressInfo(String mDayNumba, String mNotes){
        this.mDayNumba = mDayNumba;
        this.mNotes = mNotes;
    }

    @Override
    public String toString() {
        return "            Day: '" + mDayNumba + '\'' +
                "           Notes: '" + mNotes + '\''
                ;
    }
}
