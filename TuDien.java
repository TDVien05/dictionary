package tudien;

import java.util.Map;
import java.util.TreeMap;

public class TuDien {
    private Map<String, String> td = new TreeMap<String, String>();

    public TuDien() {
        this.td = new TreeMap<>();
    }
    
    public void themTu(String tuKhoa, String yNghia) {
        this.td.put(tuKhoa, yNghia);
    }
    
    public void xoaTu(String tuKhoa) {
        this.td.remove(tuKhoa);
    }
    
    public void hienThiDanhSach() {
        for(String key : this.td.keySet()) {
            System.out.println(key);
        }
    }
    
    public String timTu(String tuKhoa) {
        return this.td.get(tuKhoa);
    }
    
    public int showList() {
        return this.td.size();
    }
}
