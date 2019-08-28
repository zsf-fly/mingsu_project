package com.qf.pojo;

import java.util.List;

public class Menu {
    int menuid;
    String menuname;
    int parentid;
    String menu_url;
    List<Menu> childMenu;

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public List<Menu> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<Menu> childMenu) {
        this.childMenu = childMenu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuid=" + menuid +
                ", menuname='" + menuname + '\'' +
                ", parentid=" + parentid +
                ", menu_url='" + menu_url + '\'' +
                ", childMenu=" + childMenu +
                '}';
    }
}
