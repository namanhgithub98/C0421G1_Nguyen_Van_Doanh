package modle;

public class House extends Facility {
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private String SoTang;
    public House(){

    }
    public House(String tieuChuanPhong,String tienNghiKhac,String soTang) {
        this.tieuChuanPhong=tieuChuanPhong;
        this.tienNghiKhac=tienNghiKhac;
        this.SoTang=soTang;
    }
    public House( String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue,
                 String tieuChuanPhong,String tienNghiKhac,String soTang) {
        super(tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
        this.tieuChuanPhong=tieuChuanPhong;
        this.tienNghiKhac=tienNghiKhac;
        this.SoTang=soTang;
    }
    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }
    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getSoTang() {
        return SoTang;
    }

    public void setSoTang(String soTang) {
        this.SoTang = soTang;
    }


//    @Override
//    public String showInfor() {
//        return "House { " +
//                super.showInfor() +
//                ", Tiêu Chuẩn Phòng = '" + tieuChuanPhong + '\'' +
//                ", Tiện Nghi Khác = '" + tienNghiKhac + '\'' +
//                ", Số Tầng = '" + SoTang + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "House{" +
                super.toString()+","+ '\'' +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", tienNghiKhac='" + tienNghiKhac + '\'' +
                ", SoTang='" + SoTang + '\'' +
                '}';
    }
}
