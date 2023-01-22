package constants;

public enum Code {
    SUCESS(200),
    BADREQUEST(400);

    private int code;
    Code(int code){
        this.code = code;
    }
    public int getCode() {
        return this.code;
    }
}
