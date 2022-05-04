/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.Jdbc.JdbcHelper;
import com.edusys.entity.NguoiHoc;
import com.edusys.entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO-PC
 */
public class nguoihocDAO extends edusysDAO<NguoiHoc, String> {

    String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?, MaNV=? WHERE MaNH=?";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH=?";
    String SELECT_ALL_SQL = "SELECT*FROM NguoiHoc";
    String SELECT_BY_ID_SQL = "SELECT*FROM NguoiHoc WHERE MaNH=?";

    @Override
    public void insert(NguoiHoc entity) {
        String sql="INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
         JdbcHelper.update(sql,
             entity.getMaNH(),
             entity.getHoTen(),
             entity.getNgaySinh(),
             entity.isGioiTinh(),
             entity.getDienThoai(),
             entity.getEmail(),
             entity.getGhiChu(),
             entity.getMaNV());
    }

    @Override
    public void update(NguoiHoc entity) {
       String sql="UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?,MaNV=? WHERE MaNH=?";
        JdbcHelper.update(sql,            
                 entity.getHoTen(),
                 entity.getNgaySinh(),
                 entity.isGioiTinh(),
                 entity.getDienThoai(),
                 entity.getEmail(),
                 entity.getGhiChu(),
                 entity.getMaNV(),
                 entity.getMaNH());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NguoiHoc> selectALL() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectByID(String id) {
        List<NguoiHoc> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

    @Override
    protected List<NguoiHoc> selectBySQL(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<NguoiHoc>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MaNH"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setNgaySinh(rs.getString("NgaySinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayDK(rs.getString("NgayDK"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<NguoiHoc> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
        return this.selectBySQL(sql, "%" + keyword + "%");
    }
    public List<NguoiHoc> selectNotlnCourse(int makh,String keyword){
        String sql="SELECT * FROM NguoiHoc WHERE HoTen LIKE ? AND MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        return this.selectBySQL(sql, "%"+keyword+"%",makh);
    }
}
