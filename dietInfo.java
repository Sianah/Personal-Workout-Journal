public class dietInfo {
    private String mDescription;
    private String mCalories;
    private String mFat;
    private String mCholesterol;
    private String mSodium;
    private String mCarbohydrates;
    private String mProtein;
    private String mResult;

    public String getmProtein() {
        return this.mProtein;
    }

    public void setmProtein(String mProtein) {
        this.mProtein = mProtein;
    }

    public String getmDescription(){
        return this.mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmCalories(){
        return this.mCalories;
    }

    public void setmCalories(String mCalories) {
        this.mCalories = mCalories;
    }

    public String getmFat(){
        return this.mFat;
    }

    public void setmFat(String mFat) {
        this.mFat = mFat;
    }

    public String getmCholesterol() {
        return this.mCholesterol;
    }

    public void setmCarbohydrates(String mCarbohydrates) {
        this.mCarbohydrates = mCarbohydrates;
    }

    public String getmSodium() {
        return this.mSodium;
    }

    public void setmSodium(String mSodium) {
        this.mSodium = mSodium;
    }

    public String getmCarbohydrates() {
        return this.mCarbohydrates;
    }

    public void setmCholesterol(String mCholesterol) {
        this.mCholesterol = mCholesterol;
    }

    public String getmResult() {
        return this.mResult;
    }

    public void setmResult(String mResult) {
        this.mResult = mResult;
    }
    public dietInfo(String mDescription, String mCalories, String mFat, String mCholesterol, String mSodium, String mCarbohydrates, String mProtein, String mResult){
        this.mDescription = mDescription;
        this.mCalories = mCalories;
        this.mFat = mFat;
        this.mCholesterol = mCholesterol;
        this.mSodium = mSodium;
        this.mCarbohydrates = mCarbohydrates;
        this.mProtein = mProtein;
        this.mResult = mResult;
    }
    public String toString() {
        return "dietInformation{" +
                "mDescription='" + mDescription + '\'' +
                ", mCalories='" + mCalories + '\'' +
                ", mFat=" + mFat + '\'' +
                ", mCholesterol=" + mCholesterol + '\'' +
                ", mSodium=" + mSodium + '\'' +
                ", mCarbohydrates=" + mCarbohydrates + '\'' +
                ",mProtein=" +mProtein + '\'' +
                ", mResult=" + mResult +
                '}';
    }
}
