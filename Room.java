public class Room {
    private int rID;
    private int rCap;
    private Type rType;
    private AC aC;
    private int rAmount;
     private boolean roomAvai;
     private boolean rBook;
     private int roomCode;

    public Room(int rID, int rCap, Type rType, int rAmount,AC aC) {
        this.rID = rID;
        this.rCap = rCap;
        this.rType = rType;
        this.rAmount = rAmount;
        this.aC = aC;
    }

    public int getrID() {
        return rID;
    }

    public void setrID(int rID) {
        this.rID = rID;
    }

    public int getrCap() {
        return rCap;
    }

    public void setrCap(int rCap) {
        this.rCap = rCap;
    }

    public Type getrType() {
        return rType;
    }

    public void setrType(Type rType) {
        this.rType = rType;
    }

    public int getrAmount() {
        return rAmount;
    }

    public void setrAmount(int rAmount) {
        this.rAmount = rAmount;
    }

    public AC getaC() {
        return aC;
    }

    public void setaC(AC aC) {
        this.aC = aC;
    }

    public boolean isRoomAvai() {
        return roomAvai;
    }

    public void setRoomAvai(boolean roomAvai) {
        this.roomAvai = roomAvai;
    }

    public boolean isrBook() {
        return rBook;
    }

    public void setrBook(boolean rBook) {
        this.rBook = rBook;
    }

    public int getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(int roomCode) {
        this.roomCode = roomCode;
    }
}
