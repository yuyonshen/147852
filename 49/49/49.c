//先输入是个数据，先将是个数据中的奇数找到，再将所有奇数求和
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int i;
	int *p;
	int arr[10];
	printf("请输入十个数据：\n");
	for (i = 0; i < 10; i++){
		scanf("%d", &arr[i]);
	}
	p = arr;
	find(p,10);
	system("pause");
	return 0;
}
int find(int *p,int n){
	int sum = 0;
	int i;
	for (i = 0; i < n; i++){
		if (*(p + i) % 2 != 0){
			printf("%d\n", *(p + i));
			sum = sum + *(p + i);
		}
		}
	printf("sum=%d", sum);
}*/
//利用指针冒泡排序
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int  pailie(int *p, int n){
	int i;
	int t;
	int j;
	for (i = 0; i < n - 1; i++){
		for (j = 0; j < n - 1 - i; j++){
			if (*(p + j)>*(p + j + 1)){
				t = *(p + j);
				*(p + j) = *(p + j + 1);
				*(p + j + 1) = t;
			}
		}
	}
	printf("排列好的数组：\n");
	for (i = 0; i < n; i++){
		if (i % 5 == 0){
			printf("\n");
		}
		printf("%d\t", *(p + i));
	}
	printf("\n");
	return 0;
}
int main(){
	int a[20];
	int i;
	int n;
	printf("请输入数组个数：\n");
	scanf("%d", &n);
	printf("请输入数组原属：\n");
	for (i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
	pailie(a, n);
	system("pause");
	return 0;
}
