package modle;

public class Customer extends Person {
    private String maKH;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String id, String phoneNumber, String email,
                    String maKH, String loaiKhach, String diaChi) {
        super(name, birthday, gender, id, phoneNumber, email);
        this.maKH = maKH;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    @Override
    public String showInfor() {
        return "Customer{" +
                "maKH='" + maKH + '\'' +
                super.toString()+","+ '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    @Override
    public String toString() {
        return "Customer{" +
                "maKH='" + maKH + '\'' +
                super.toString()+","+ '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
