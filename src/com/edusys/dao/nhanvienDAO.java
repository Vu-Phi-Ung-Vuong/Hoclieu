/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.Jdbc.JdbcHelper;
import com.edusys.entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO-PC
 */
public class nhanvienDAO extends edusysDAO<NhanVien, String>{
    String INSERT_SQL="INSERT INTO NhanVien(MaNV,MatKhau,HoTen,VaiTro)VALUSE(?,?,?,?)";
    String UPDATE_SQL="UPDATE NhanVien SET MatKhau=?,HoTen=?,VaiTro=?WHERE MaNV=?";
    String DELETE_SQL="DELETE FROM NhanVien WHERE MaNV=?";
    String SELECT_ALL_SQL="SELECT*FROM NhanVien";
    String SELECT_BY_ID_SQL="SELECT*FROM NhanVien WHERE MaNV=?";
    @Override
    public void insert(NhanVien entity) {
        String sql="INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
        JdbcHelper.update(sql, 
                entity.getMaNV(), 
                entity.getMatKhau(), 
                entity.getHoTen(), 
                entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        String sql="UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
        JdbcHelper.update(sql, 
                entity.getMatKhau(), 
                entity.getHoTen(), 
                entity.isVaiTro(),
                entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM NhanVien WHERE MaNV=?";
        JdbcHelper.update(sql, id);
    }

    @Override
    public List<NhanVien> selectALL() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectByID(String id) {
        List<NhanVien> list=this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
        
    }

    @Override
    protected List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien>list=new ArrayList<NhanVien>();
        try{
            ResultSet rs=JdbcHelper.query(sql, args);
            while(rs.next()){
                NhanVien entity=new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw  new RuntimeException(e);
        }
    }
    
}
