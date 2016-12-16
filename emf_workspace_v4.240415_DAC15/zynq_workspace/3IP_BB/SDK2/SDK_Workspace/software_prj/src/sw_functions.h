/*
 * sw_functions.h
 *
 *  Created on: Feb 12, 2014
 *      Author: ga73koz
 */

#ifndef SW_FUNCTIONS_H_
#define SW_FUNCTIONS_H_

//void ConvToGray(unsigned long ImgIn_BaseAddr,unsigned long ImgOut_BaseAddr,
//		unsigned short horizontalActiveTime);
void ConvToGray(unsigned long ImgIn_BaseAddr,unsigned long ImgOut_BaseAddr,unsigned short width, unsigned short height,
		unsigned short horizontalActiveTime);

void EdgeDetection(unsigned long ImgIn_BaseAddr,unsigned long ImgOut_BaseAddr,
		unsigned short width, unsigned short height, unsigned short h_ActiveTime);

void Erode(unsigned long ImgIn_BaseAddr,unsigned long ImgOut_BaseAddr,
		unsigned short width, unsigned short height, unsigned short h_ActiveTime);

unsigned char rgb2y(unsigned char R, unsigned char G, unsigned char B);

void ConvToGrayHLS(unsigned long ImgIn_BaseAddr,unsigned long ImgOut_BaseAddr,unsigned short horizontalActiveTime);

void kernel_apply(int* _src, int* _dst,float _par[3]);

#endif /* SW_FUNCTIONS_H_ */
