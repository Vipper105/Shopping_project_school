package dao;

import java.util.ArrayList;
import java.util.List;

import model.SanPham;

public interface SanPhamDAO {
//lấy danh sách sản phẩm theo chuyên mục

    public ArrayList<SanPham> getListProductByCategory(String ma_danh_muc);

//hiển thị thông tin chi tiết sản phẩm
    public SanPham getChiTietSanPham(String ma_san_pham);

    //thêm sản phẩm
    public void addSanPham(SanPham c);

// lấy danh sách sản phẩm
    public ArrayList<SanPham> getList();

    // xóa sản phẩm theo mã sản phẩm
    public void delSanPham(String ma_san_pham);

    public SanPham getSanPham(String ma_san_pham);

    // cập nhật sản phẩm
    public void updateSanPham(SanPham c);
    
    public ArrayList<SanPham> getListByPage(ArrayList<SanPham> arr,int start,int end);
    
    //lấy danh sách sản phẩm có số lượng nhiều nhất
    public ArrayList<SanPham> getListProductTop4();
    
    //lấy danh sách sản phẩm có giá thấp nhất
    public ArrayList<SanPham> getListProductBotPrice();
   
}
