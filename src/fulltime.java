class fulltime extends nhanVien {
    @Override
    public void setLuongNhanVien() {
        this.luongNhanVien = 30000;
    }

    @Override
    public void setWorking_time(byte working_time) {
        if (working_time < 0) {
            System.out.println("working time input < 0");
        } else if (working_time < 40) {
            this.working_time = working_time;
            System.out.println("not enough working time");
        } else {
            this.working_time = working_time;
        }
    }

}

