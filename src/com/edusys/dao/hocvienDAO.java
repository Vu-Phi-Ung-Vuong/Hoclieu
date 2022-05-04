/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.Jdbc.JdbcHelper;
import com.edusys.entity.HocVien;
import com.edusys.entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO-PC
 */
public class hocvienDAO extends edusysDAO<HocVien, String> {

    String INSERT_SQL = "INSERT INTO HocVien(MaHV,MaKH,MaNH,Diem)VALUSE(?,?,?,?)";
    String UPDATE_SQL = "UPDATE HocVien SET MaKH=?,MaNH=?,Diem=?WHERE MaHV=?";
    String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV=?";
    String SELECT_ALL_SQL = "SELECT*FROM HocVien";
    String SELECT_BY_ID_SQL = "SELECT*FROM HocVien WHERE MaHV=?";

    @Override
    public void insert(HocVien entity) {
        String sql = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?)";
        JdbcHelper.update(sql,
                entity.getMaKH(),
                entity.getMaNH(),
                entity.getDiem());

    }

    @Override
    public void update(HocVien entity) {
        String sql = "UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=?";
        JdbcHelper.update(sql,
                entity.getMaKH(),
                entity.getMaNH(),
                entity.getDiem(),
                entity.getMaHV());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<HocVien> selectALL() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectByID(String id) {
        List<HocVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

    @Override
    protected List<HocVien> selectBySQL(String sql, Object... args) {
        List<HocVien> list = new ArrayList<HocVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getDouble("Diem"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HocVien> selectByKhoaHoc(int maKH) {
        String sql = "SELECT * FROM HocVien WHERE MaKH=?";
        return this.selectBySQL(sql, maKH);
    }

    public void delete1(int id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    public HocVien selectByID1(int id) {
        List<HocVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

}
