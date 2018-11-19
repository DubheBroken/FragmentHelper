# FragmentHelper
[Android] A fragment management tool class that supports switching fragment operations in various locations.
The source code contains Dome.
### readme doc
[简体中文](/README.md) [繁体中文](/README-TW.md)
### How to use
Download the ```FrgmentHelper.java``` file from the source directory and place it in your project's Java src directory.
#### Layout
Prepare a ```FrameLayout``` in your project and copy its ```ID``` to ```FragmentHelper`` #64 and #66 to replace ```frame_main```
#### How to switch Fragment
Call the following code in your ```Activity```, where ```Fragment2``` is an instance of the target ```Fragment``.
```Java
FragmentHelper.switchFragment(new Fragment2(), this);
```
#### How to back Fragment
Press the back key directly to perform the rollback operation. When there is only one left of the ```Fragment``` in the rollback stack, the APP will be hidden to the background.
If your ```Activity``` overrides the ```onBackPressed``` method, call the following code to perform the rollback operation.
##### In Activity
```Java
FragmentHelper.back(this);
```
##### In Fragment
```Java
FragmentHelper.back((AppCompatActivity) getActivity());
```
#### Hot to get an instance of FragmentManager or FragmentTransaction
```Java
FragmentManager fm = FragmentHelper.getFragmentManager();

FragmentTransaction ft = FragmentHelper.getFragmentTransaction();
