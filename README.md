# ListTile

A single fixed-height row that contains some text ( title and subtitle ) as well as a leading or trailing icon.

# Example

![alt text](https://miro.medium.com/max/400/1*yG_zEeVgPSm8ijwcHmPTLQ.png)

# How to use

Step 1. Add the JitPack repository to your build file

 allprojects {
		repositories {
       maven { url 'https://jitpack.io' }
		}
 }
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.hossam1244:ListTile:1.0'
	}  


Step 3. Add the view to the xml code

<com.hossam.list_tile.ListTile
    android:id="@+id/list_item"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintLeft_toLeftOf="parent"
    app:layout_constraintRight_toRightOf="parent"
    app:layout_constraintTop_toTopOf="parent"
    />
    
Step 4. Assign the listTile values progmaticlly 

   list_item.setTitle("this is a title")
   list_item.setSubtitle("this is a subtitle")
   list_item.setImageDrawable(this.getDrawable(R.drawable.ic_launcher_background))
	
