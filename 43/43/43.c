//指针二位数组的输入和输出
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a[3][5];
	int i,j;
	printf("请输入数字：\n");
	for (i = 0; i < 3; i++){
		for (j = 0; j < 5; j++){
			printf("a[%d][%d]=\n", i, j);
			scanf("%d", a[i] + j);
		}
	}
	printf("%d\n", a[i] + j);
	for (i = 0; i < 3; i++){
		for (j = 0; j < 5; j++){
			printf("%d `", *(a[i] + j));
		}
	}
	printf("\n");
	system("pause");
	return 0;
}
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a[3][5];
	int i, j;
	int(*p)[5];
	p = &a[0];
	printf("input :\n");
	for (i = 0; i < 3; i++){
		for (j = 0; j < 5; j++){
			scanf("%d", *(p + i) + j);
		}
	}
	p = &a[2];
	for (j = 0; j < 5; j++){
		printf("%d\n", *((*p) + j));		
	}
	printf("\n");
	system("pause");
	return 0;
}*/
//在二维数组中a[i]+j表示的是第i行第j列中的数字元数
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a[10];
	int *p1, **p2;
	int i;
	int n = 0;
	for (i = 0; i < 10; i++){
		printf("a[%d]=", i);
		scanf("%d", &a[i]);
	}
	p1 = a;
	p2 = &p1;
	for (i = 0; i < 10; i++){
		if (*(*p2 + i) % 2 == 0){
			printf("%d", *(*p2 + i));
			n++;
		}
	}
	printf("\n");
	printf("%d\n", n);
	system("pause");
	return 0;
}