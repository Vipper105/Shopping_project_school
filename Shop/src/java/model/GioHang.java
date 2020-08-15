package model;

import java.util.Map;
import java.util.TreeMap;

public class GioHang {

    private TreeMap<SanPham, Integer> list;
    private long cartID;

    public GioHang() {
        list = new TreeMap<>();
        cartID = System.currentTimeMillis();

    }

    public GioHang(TreeMap<SanPham, Integer> list, long cartID) {
        this.list = list;
        this.cartID = cartID;
    }

    public TreeMap<SanPham, Integer> getList() {
        return list;
    }

    public void setList(TreeMap<SanPham, Integer> list) {
        this.list = list;
    }

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }
// them san pham
    public void addToCart(SanPham sp, int so_luong) {
        boolean bln = list.containsKey(sp);
        if (bln) {
            int sl = list.get(sp);
            so_luong += sl;
            list.put(sp, so_luong);
        } else {
            list.put(sp, so_luong);

        }

    }
// xoa san pham update lai cart
    public void subToCart(SanPham sp, int so_luong) {
        boolean bln = list.containsKey(sp);
        if (bln) {
            int sl = list.get(sp);
            so_luong = sl - so_luong;
            if (so_luong <= 0) {
                list.remove(sp);
            } else {
                list.remove(sp);
                list.put(sp, so_luong);
            }

        }

    }
//xoa san pham khoi cart
    public void removeToCart(SanPham sp) {
        boolean bln = list.containsKey(sp);
        if (bln) {
            list.remove(sp);
        }
    }

    public int countItem(){
    int count=0;
    for(Map.Entry<SanPham,Integer> list:list.entrySet()){
    count+=list.getValue();
    }
    return count;
    }
    public double total(){
    int count=0;
    for(Map.Entry<SanPham,Integer> list:list.entrySet()){
    count+=list.getValue()*list.getKey().getDon_gia();
    }
    return count;
    }
}
