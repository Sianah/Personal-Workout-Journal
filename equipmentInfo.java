public class equipmentInfo {
  private String mEquipName;
 private String mEquipDesc;

 public String getmEquipName(){
     return this.mEquipName;
 }
 public void setmEquipName(String mEquipName){
     this.mEquipName = mEquipName;
 }
 public String getmEquipDesc(){
     return this.mEquipDesc;
 }
 public void setmEquipDesc(String mEquipDesc){
     this.mEquipDesc = mEquipDesc;
 }
 public equipmentInfo(String mEquipName, String mEquipDesc){
     this.mEquipName = mEquipName;
     this.mEquipDesc = mEquipDesc;
 }

    @Override
    public String toString() {
        return "            Name: '" + mEquipName + '\'' +
                "           Description: '" + mEquipDesc + '\''
                ;
    }
}
