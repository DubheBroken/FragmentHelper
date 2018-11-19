package com.dubhe.broken.fragmenthelper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * 作者：DubheBroken
 * 时间：2018/11/19
 * 地址：github.com/DubheBroken/FragmentHelper
 * 说明：Fragment管理工具类
 */

public class FragmentHelper {

    private static FragmentManager fragmentManager;
    private static FragmentTransaction fragmentTransaction;

    private static FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    private static void setFragmentManager(FragmentManager fragmentManager) {
        FragmentHelper.fragmentManager = fragmentManager;
    }

    public static FragmentTransaction getFragmentTransaction() {
        return fragmentTransaction;
    }

    public static void setFragmentTransaction(FragmentTransaction fragmentTransaction) {
        FragmentHelper.fragmentTransaction = fragmentTransaction;
    }

    private static void initFragmentTransaction() {
        fragmentTransaction = fragmentManager.beginTransaction();
    }

    /**
     * 此方法在onBackPressed被重写时使用
     * 回退到上一层fragment
     * 如果已经是最后一层，隐藏界面
     */
    public static void back(AppCompatActivity activity) {
        if (getFragmentManager().getBackStackEntryCount() <= 1) {
            activity.moveTaskToBack(true);
        }else{
            fragmentManager.popBackStack();
        }
    }

    /**
     * 切换Fragment为传入参数
     *
     * @param activity 当前activity，仅支持AppCompatActivity
     *                 在fragment中请使用(AppCompatActivity)getActivity()作为参数传入
     * @param fragment 目标fragment对象
     */
    public static void switchFragment(Fragment fragment, AppCompatActivity activity) {
        FragmentHelper.setFragmentManager(activity.getSupportFragmentManager());
        FragmentHelper.initFragmentTransaction();
        //frame容器id
        fragmentManager.findFragmentById(R.id.frame_main);
        fragmentTransaction
                .replace(R.id.frame_main, fragment)
                .addToBackStack(null)
                .commit();//替换成下面那句可以在frameLayout容器被遮挡的情况下替换fragment
//                .commitAllowingStateLoss();
    }

}
