# FragmentHelper
[Android]一个fragment的管理工具类，支持在各种位置进行切换fragment操作  
源码已包含Dome
### 读我文档
[English](/README-EN.md) [繁体中文](/README-TW.me)
### 如何使用
下载源码目录中的```FrgmentHelper.java```文件并把它放到你项目的Java源码目录中。
#### Layout
在你的项目中准备一个```FrameLayout```控件，并把它的```ID```写到```FragmentHelper```的#64和#66替换掉```frame_main```
#### 切换Fragment
在你的```Activity```中调用下列代码，其中```Fragment2```为目标```Fragment```的实例。
```Java
FragmentHelper.switchFragment(new Fragment2(), this);
```
#### 回退Fragment
直接按返回键即可进行回退操作，当回退栈中的```Fragment```只剩下一个时，会隐藏APP到后台。  
如果你的```Activity```重写了```onBackPressed```方法，调用下列代码即可进行回退操作。
##### 在Activity中
```Java
FragmentHelper.back(this);
```
##### 在Fragment中
```Java
FragmentHelper.back((AppCompatActivity) getActivity());
```
#### 获取FragmentManager和FragmentTransaction的实例
```Java
FragmentManager fm = FragmentHelper.getFragmentManager();

FragmentTransaction ft = FragmentHelper.getFragmentTransaction();
```
