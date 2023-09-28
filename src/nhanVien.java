abstract public class nhanVien {
    boolean fulltime;
    byte kpi;
    byte working_time;
    int luongNhanVien;

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }


    abstract public void setLuongNhanVien();

    abstract public void setWorking_time(byte working_time);

    public void setKpi(byte kpi) {
        if (kpi < 0) {
            System.out.println("kpi input < 0");
        } else if (kpi < 80) {
            this.kpi = kpi;
            System.out.println("thieu kpi");

        } else if (kpi <= 100) {
            this.kpi = kpi;
            System.out.println("du kpi");
        } else {
            this.kpi = kpi;
            System.out.println("thua kpi");
        }
    }

    public double tinhLuong() {
        if (kpi < 80) {
            System.out.println("tinh luong muc 1");
            return luongNhanVien * kpi * working_time;
        } else if (kpi <= 100) {
            System.out.println("tinh luong muc 2");
            return luongNhanVien * kpi * 1.1 * working_time;
        } else {
            System.out.println("tinh luong muc 3");
            return luongNhanVien * kpi * 1.25 * working_time;

        }

    }


}
