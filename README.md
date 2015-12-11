### git repo for Android Library's test code.

### Path settings (build.gradle)

* Please add your android sdk and support libraries path.

For example:

testCompile fileTree(dir: '/Users/nguyen_huubaotrung/Tools/android-sdks/platforms/android-23/', includes: ['android.jar'])
testCompile fileTree(dir: '/Users/nguyen_huubaotrung/Tools/android-sdks/extras/android/support/v7/appcompat/libs', includes: ['android-support-v4.jar'])

* Please also add your library's source code path (sourceDirectories) in order to use jacoco report plugin, and please make sure you have test.exec file in your build folder.

For example:

task jacoco(type: JacocoReport) {

    ...

        classDirectories = fileTree(
                dir: './libs',
                includes: ['library-name.jar'])

        sourceDirectories = files('/Users/nguyen_huubaotrung/Source-code/library-name/src')

        executionData = files('build/jacoco/test.exec')
}

### Commands:

* For synchronizing all necessary modules/libraries

$ gradle intellijModuleSync

* For running test:

$ gradle test

* For exporting jacoco test report (html file)

    $ gradle jacoco

    note: Jacoco Report's html file can be found in ${project.rootDir}/build/reports/jacoco/${project.name}/jacoco_report.html
