#define  _CRT_SECURE_NO_WARNINGS//Ìõ¼þÓï¾äµÄÁ·Ï°
#include<stdio.h>
#include<stdlib.h>
int main(){
	int x=0,i;
	int y;
	printf("%d\n", x);
	scanf("%d",&x);
	if(x < 1){
		i = 1;
	}
	else if (x >= 1 && x < 10){
		i = 2;
	}
	else
		i = 3;
	switch (i){
	case 1:
		y = x;
		break;
	case 2:
		y = 2 * x - 1;
		break;
	case 3:
		y = 2 * x - 11;
		break;
	}
	printf("y=%d\n", y);
	system("pause");
	return 0;
}
int main(){
	int x, y, z;
	int max;
	printf("input x,y,z\n");
	scanf("%d %d %d", &x, &y, &z);
	if (x < y){
		max = y;
	}
	else {
		max = x;
	}
	if (max>z){
		printf("%d\n", max);
	}
	else
		max = z;
	printf("%d\n", max);
	system("pause");
	return 0;
}
