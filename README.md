# IOlib
一个用于android快速开发库，主要功能为集成三方io相关，包括但可能不限于本地文件、
数据库、网络请求库、图片处理库等。
## 集成说明（gradle）
#### Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
#### Step 2. Add the dependency
	dependencies {
	        compile 'com.github.CodeDogLSY:IOlib:v0.0.1'
	}

## net相关
#### 使用Retrofit2&fastjson，配合rxjava2使用。
示例参考NetActivity。
## img相关
#### 使用glide
示例参考ImgActivity。