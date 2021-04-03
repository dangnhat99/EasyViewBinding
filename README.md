# EasyViewBinding

[![](https://jitpack.io/v/dangnhat99/EasyViewBinding.svg)](https://jitpack.io/#dangnhat99/EasyViewBinding)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	 implementation 'com.github.dangnhat99:EasyViewBinding:ac23f39b39'
}
```

## Configuration

View binding is enabled on a module by module basis. 
To enable view binding in a module, set the viewBinding build option to true in the 
module-level `build.gradle` file, as shown in the following example:

```gradle
android {
    ...
    buildFeatures {
        viewBinding true
    }
}
```


## Usage

Activity:

``` kotlin
class MainActivity : AppCompatActivity() {
    //create a binding instance
    private val binding by viewBinding(MainActivityBinding:: inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView using binding.root
        setContentView(binding.root)
        
        //now you can call binding to access your activity's views
        binding.txtHello.text = "Easy binding"
    }
}
```
Fragment:

``` kotlin
class MyFragment : Fragment(R.layout.my_fragment) {

    private val binding by viewBinding(MyFragmentBinding:: bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtHello.text = "Easy binding"
    }
}
```
