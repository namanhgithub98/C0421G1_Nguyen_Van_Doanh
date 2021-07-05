package modle;

public abstract class Facility {
    private String tenDichVu;
    private String dienTichSD;
    private String chiPhiThue;
    private String soNguoiTD;
    private String kieuThue;

    public Facility() {
    }

    public Facility( String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSD = dienTichSD;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiTD = soNguoiTD;
        this.kieuThue = kieuThue;
    }


    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSD() {
        return dienTichSD;
    }

    public void setDienTichSD(String dienTichSD) {
        this.dienTichSD = dienTichSD;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoNguoiTD() {
        return soNguoiTD;
    }

    public void setSoNguoiTD(String soNguoiTD) {
        this.soNguoiTD = soNguoiTD;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }


    @Override
    public String toString() {
        return "Facility{" +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSD='" + dienTichSD + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soNguoiTD='" + soNguoiTD + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
