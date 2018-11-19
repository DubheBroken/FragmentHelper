# FragmentHelper
[Android]一個fragment的管理工具類，支持在各種位置進行切換fragment操作
源碼已包含Dome
### 讀我文檔
[English](/README-EN.md)    [简体中文](/README.md)
### 如何使用
下載源碼目錄中的```FrgmentHelper.java```文件並把它放到你項目的Java源碼目錄中。
#### Layout
在你的項目中準備一個```FrameLayout```控件，並把它的```ID```寫到```FragmentHelper```的#64和#66替換掉```frame_main`` `
#### 切換Fragment
在你的```Activity```中調用下列代碼，其中```Fragment2```為目標```Fragment```的實例。
```Java
FragmentHelper.switchFragment(new Fragment2(), this);
```
#### 回退Fragment
直接按返回鍵即可進行回退操作，當回退棧中的```Fragment```只剩下一個時，會隱藏APP到後台。
如果你的```Activity```重寫了```onBackPressed```方法，調用下列代碼即可進行回退操作。
##### 在Activity中
```Java
FragmentHelper.back(this);
```
##### 在Fragment中
```Java
FragmentHelper.back((AppCompatActivity) getActivity());
```
#### 獲取FragmentManager和FragmentTransaction的實例
```Java
FragmentManager fm = FragmentHelper.getFragmentManager();

FragmentTransaction ft = FragmentHelper.getFragmentTransaction();
```
