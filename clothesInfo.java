public class clothesInfo {
    private String mClothesName;
    private String mClothesDescription;

    public String getmClothesName(){
        return this.mClothesName;
    }

    public void setmClothesName(String mClothesName) {
        this.mClothesName = mClothesName;
    }

    public String getmClothesDescription() {
        return this.mClothesDescription;
    }

    public void setmClothesDescription(String mClothesDescription) {
        this.mClothesDescription = mClothesDescription;
    }
    public clothesInfo(String mClothesName, String mClothesDescription){
        this.mClothesName = mClothesName;
        this.mClothesDescription = mClothesDescription;
    }

    @Override
    public String toString() {
        return "            Name: '" + mClothesName + '\'' +
                "           Description: '" + mClothesDescription + '\''
                ;
    }
}
