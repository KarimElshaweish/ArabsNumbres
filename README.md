# ArabsNumbres
# this library used to convert English numbers to Arabic word

## Add it in your root build.gradle at the end of repositories:

`allprojects {`
		`repositories {`
			`...`
			`maven { url 'https://jitpack.io' }`
		`}`
	`}`

## Step 2. Add the dependency
`dependencies {`
	        `implementation 'com.github.KarimElshaweish:ArabsNumbres:1.0'`
	`}`

## Example to use it:
`NumberConverter.arabNumber(4.toString())`
  
