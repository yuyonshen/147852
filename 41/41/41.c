//定义一个标识符位max的函数
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int MAX(int a, int b){
	if (a > b){
		return a;
	}
	else
		return b;
}
int main(){
	int a,b;
	printf("请输入两个数比较");
	scanf("%d%d", &a,&b);
	int max = MAX(a, b);
	printf("%d\n", max);
	system("pause");
	return 0;
}
#include<stdio.h>
#include<stdlib.h>
int main(){
	int num;
	int score[10] = { 98, 45, 65, 76, 78, 96, 93, 81, 94, 92 };
	num=Averaging(score);
	printf("%d\n", num);
	system("pause");
	return 0;
}
int Averaging(int score[10]){
	int num=0;
	for (int i = 0; i < 10; i++){
		num =  num+score[i];
	}
	
	return num /= 10;
}
