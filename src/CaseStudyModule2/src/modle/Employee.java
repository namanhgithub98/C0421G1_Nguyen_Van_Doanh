package modle;

public class  Employee extends Person {
    private String maNV;
    private String trinhDo;
    private String viTri;
    private String luong;

    public Employee() {
    }

    public Employee(String name, String birthday, String gender, String id, String phoneNumber, String email, String maNV, String trinhDo, String viTri, String luong) {
        super(name, birthday, gender, id, phoneNumber, email);
        this.maNV = maNV;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String showInfor() {
        return "Employee{" +
                "maNV='" + maNV + '\'' +
                super.toString()+","+ '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong='" + luong + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Employee{" +
                "maNV='" + maNV + '\'' +
                super.toString()+","+ '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong='" + luong + '\'' +
                '}';
    }
}
