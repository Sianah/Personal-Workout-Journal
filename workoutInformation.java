public class workoutInformation {
    private String mSunday;
    private String mMonday;
    private String mTuesday;
    private String mWednesday;
    private String mThursday;
    private String mFriday;
    private String mSaturday;

    public String getmSunday(){
     return this.mSunday;
    }

    public void setmSunday(String mSunday) {
        this.mSunday = mSunday;
    }

    public String getmMonday(){
        return this.mMonday;
    }

    public void setmMonday(String mMonday) {
        this.mMonday = mMonday;
    }

    public String getmTuesday(){
        return this.mTuesday;
    }

    public void setmTuesday(String mTuesday) {
        this.mTuesday = mTuesday;
    }

    public String getmWednesday(){
        return this.mWednesday;
    }

    public void setmWednesday(String mWednesday) {
        this.mWednesday = mWednesday;
    }

    public String getmThursday(){
        return this.mThursday;
    }

    public void setmThursday(String mThursday) {
        this.mThursday = mThursday;
    }

    public String getmFriday(){
        return this.mFriday;
    }

    public void setmFriday(String mFriday) {
        this.mFriday = mFriday;
    }

    public String getmSaturday(){
        return this.mSaturday;
    }

    public void setmSaturday(String mSaturday) {
        this.mSaturday = mSaturday;
    }
    public workoutInformation(String mSunday, String mMonday, String mTuesday, String mWednesday, String mThursday, String mFriday, String mSaturday){
        this.mSunday = mSunday;
        this.mMonday = mMonday;
        this.mTuesday = mTuesday;
        this.mWednesday = mWednesday;
        this.mThursday = mThursday;
        this.mFriday = mFriday;
        this.mSaturday = mSaturday;
    }
    public String toString() {
        return "workoutInformation{" +
                "mSunday='" + mSunday + '\'' +
                ", mMonday='" + mMonday + '\'' +
                ", mTuesday=" + mTuesday + '\'' +
                ", mWednesday=" + mWednesday + '\'' +
                ", mThursday=" + mThursday + '\'' +
                ", mFriday=" + mFriday + '\'' +
                ", mSaturday=" + mSaturday +
                '}';
    }
}
