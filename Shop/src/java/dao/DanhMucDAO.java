package dao;

import java.util.ArrayList;
import java.util.List;

import model.DanhMuc;

public interface DanhMucDAO {

    public void addDanhMuc(DanhMuc c);
    //lấy danh sách danh mục cha

    public ArrayList<DanhMuc> getListDanhMucCha();

    //lấy danh sách danh mục con
    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc);

    public List<DanhMuc> getList();

    public void delDanhMuc(String ma_danh_muc);

    public DanhMuc getDanhMuc(String ma_danh_muc);

    public void updateDanhMuc(DanhMuc c);

}
