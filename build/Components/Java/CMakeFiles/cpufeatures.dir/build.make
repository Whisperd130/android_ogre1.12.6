# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.16

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = "C:/Program Files/CMake/bin/cmake.exe"

# The command to remove a file.
RM = "C:/Program Files/CMake/bin/cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = E:/work/ogre_1.12.5

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = E:/work/ogre_1.12.5/build

# Include any dependencies generated for this target.
include Components/Java/CMakeFiles/cpufeatures.dir/depend.make

# Include the progress variables for this target.
include Components/Java/CMakeFiles/cpufeatures.dir/progress.make

# Include the compile flags for this target's objects.
include Components/Java/CMakeFiles/cpufeatures.dir/flags.make

Components/Java/CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.o: Components/Java/CMakeFiles/cpufeatures.dir/flags.make
Components/Java/CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.o: C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=E:/work/ogre_1.12.5/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object Components/Java/CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.o"
	cd E:/work/ogre_1.12.5/build/Components/Java && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.o   -c C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c

Components/Java/CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.i"
	cd E:/work/ogre_1.12.5/build/Components/Java && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c > CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.i

Components/Java/CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.s"
	cd E:/work/ogre_1.12.5/build/Components/Java && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c -o CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.s

# Object files for target cpufeatures
cpufeatures_OBJECTS = \
"CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.o"

# External object files for target cpufeatures
cpufeatures_EXTERNAL_OBJECTS =

lib/libcpufeatures.a: Components/Java/CMakeFiles/cpufeatures.dir/C_/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/android/cpufeatures/cpu-features.c.o
lib/libcpufeatures.a: Components/Java/CMakeFiles/cpufeatures.dir/build.make
lib/libcpufeatures.a: Components/Java/CMakeFiles/cpufeatures.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=E:/work/ogre_1.12.5/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C static library ../../lib/libcpufeatures.a"
	cd E:/work/ogre_1.12.5/build/Components/Java && $(CMAKE_COMMAND) -P CMakeFiles/cpufeatures.dir/cmake_clean_target.cmake
	cd E:/work/ogre_1.12.5/build/Components/Java && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/cpufeatures.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Components/Java/CMakeFiles/cpufeatures.dir/build: lib/libcpufeatures.a

.PHONY : Components/Java/CMakeFiles/cpufeatures.dir/build

Components/Java/CMakeFiles/cpufeatures.dir/clean:
	cd E:/work/ogre_1.12.5/build/Components/Java && $(CMAKE_COMMAND) -P CMakeFiles/cpufeatures.dir/cmake_clean.cmake
.PHONY : Components/Java/CMakeFiles/cpufeatures.dir/clean

Components/Java/CMakeFiles/cpufeatures.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" E:/work/ogre_1.12.5 E:/work/ogre_1.12.5/Components/Java E:/work/ogre_1.12.5/build E:/work/ogre_1.12.5/build/Components/Java E:/work/ogre_1.12.5/build/Components/Java/CMakeFiles/cpufeatures.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Components/Java/CMakeFiles/cpufeatures.dir/depend
