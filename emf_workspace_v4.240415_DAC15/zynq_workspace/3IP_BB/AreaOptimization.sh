#!/bin/sh -e
export PATH1=/nfs/TUEIEDAprojects/SystemDesign/work/ipxact/benjamin-bordes/DSE/3IP/implementation
export PATH2=/nfs/TUEIEDAprojects/SystemDesign/work/ipxact/benjamin-bordes/ProjectVDMAsonly_32bits/implementation


rm AreaOptimization.txt
find $PATH1 -name "system_map.mrp" | xargs grep "| Module" | tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +axi_interconnect_0 " | tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +axi_interconnect_0 " | tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +axi_interconnect_1 " | tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +axi_interconnect_1 " | tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +axi_interconnect_2 " | tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +axi_interconnect_2 " | tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +axi_interconnect_3 " | tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +axi_interconnect_3 " | tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +axi_interconnect_4 " | tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +axi_interconnect_4 " | tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +axi_vdma_3 "| tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +axi_vdma_3 "| tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +convert_to_gray_top_0 "| tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +convert_to_gray_top_0 "| tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +axi_vdma_2 "| tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +axi_vdma_2 "| tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +image_filter_top_0"| tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +image_filter_top_0"| tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +axi_vdma_4 "| tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +axi_vdma_4 "| tee -a AreaOptimization.txt

find $PATH1 -name "system_map.mrp" | xargs grep " +sobel_filter_top_0 "| tee -a AreaOptimization.txt
find $PATH2 -name "system_map.mrp" | xargs grep " +sobel_filter_top_0 "| tee -a AreaOptimization.txt
