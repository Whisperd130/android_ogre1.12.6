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
include PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/depend.make

# Include the progress variables for this target.
include PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/progress.make

# Include the compile flags for this target's objects.
include PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/flags.make

PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.o: PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/flags.make
PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.o: ../PlugIns/STBICodec/src/OgreSTBICodec.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=E:/work/ogre_1.12.5/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.o"
	cd E:/work/ogre_1.12.5/build/PlugIns/STBICodec && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -Wno-cast-qual -Wno-unused-function -Wno-missing-declarations -Wno-type-limits -o CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.o -c E:/work/ogre_1.12.5/PlugIns/STBICodec/src/OgreSTBICodec.cpp

PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.i"
	cd E:/work/ogre_1.12.5/build/PlugIns/STBICodec && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -Wno-cast-qual -Wno-unused-function -Wno-missing-declarations -Wno-type-limits -E E:/work/ogre_1.12.5/PlugIns/STBICodec/src/OgreSTBICodec.cpp > CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.i

PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.s"
	cd E:/work/ogre_1.12.5/build/PlugIns/STBICodec && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -Wno-cast-qual -Wno-unused-function -Wno-missing-declarations -Wno-type-limits -S E:/work/ogre_1.12.5/PlugIns/STBICodec/src/OgreSTBICodec.cpp -o CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.s

# Object files for target Codec_STBI
Codec_STBI_OBJECTS = \
"CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.o"

# External object files for target Codec_STBI
Codec_STBI_EXTERNAL_OBJECTS =

lib/libCodec_STBIStatic.a: PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/src/OgreSTBICodec.cpp.o
lib/libCodec_STBIStatic.a: PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/build.make
lib/libCodec_STBIStatic.a: PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=E:/work/ogre_1.12.5/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX static library ../../lib/libCodec_STBIStatic.a"
	cd E:/work/ogre_1.12.5/build/PlugIns/STBICodec && $(CMAKE_COMMAND) -P CMakeFiles/Codec_STBI.dir/cmake_clean_target.cmake
	cd E:/work/ogre_1.12.5/build/PlugIns/STBICodec && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Codec_STBI.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/build: lib/libCodec_STBIStatic.a

.PHONY : PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/build

PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/clean:
	cd E:/work/ogre_1.12.5/build/PlugIns/STBICodec && $(CMAKE_COMMAND) -P CMakeFiles/Codec_STBI.dir/cmake_clean.cmake
.PHONY : PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/clean

PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" E:/work/ogre_1.12.5 E:/work/ogre_1.12.5/PlugIns/STBICodec E:/work/ogre_1.12.5/build E:/work/ogre_1.12.5/build/PlugIns/STBICodec E:/work/ogre_1.12.5/build/PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : PlugIns/STBICodec/CMakeFiles/Codec_STBI.dir/depend
