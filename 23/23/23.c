#include<stdlib.h>
//两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？
#include<stdio.h>
int main(){
	int a = 1999;
	int b = 2299;
	int i;
	int count = 0;
	for (i = 0; i < 32; i++){
		if (((a >> i) & 1) == 1 && ((b >> i) & 1) != 1 || 
			((a >> i) & 1) == 0 && ((b >> i) & 1) != 0){
			count++;
			}
	}
	printf("count=%d", count);
	system("pause");
	return 0;
}