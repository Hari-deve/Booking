public class Booking {
    private int bID;
    private String bName;
    private  int bCount;
    private int bRoom;
    private boolean bRoomAvai;
    private boolean toConfirm;

    public Booking() {
    }

    public Booking(int bID, String bName, int bCount, int bRoom) {
        this.bID = bID;
        this.bName = bName;
        this.bCount = bCount;
        this.bRoom = bRoom;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbCount() {
        return bCount;
    }

    public void setbCount(int bCount) {
        this.bCount = bCount;
    }

    public int getbRoom() {
        return bRoom;
    }

    public void setbRoom(int bRoom) {
        this.bRoom = bRoom;
    }

    public boolean isbRoomAvai() {
        return bRoomAvai;
    }

    public void setbRoomAvai(boolean bRoomAvai) {
        this.bRoomAvai = bRoomAvai;
    }

    public boolean isToConfirm() {
        return toConfirm;
    }

    public void setToConfirm(boolean toConfirm) {
        this.toConfirm = toConfirm;
    }
}
