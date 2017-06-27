cmake_minimum_required(VERSION 3.6)
project(CReview)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES hello.c)
add_executable(CReview ${SOURCE_FILES})