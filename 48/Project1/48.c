//指针作为函数的参数
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void swap(int *a, int *b){
	int tmp;
	tmp = *a;
	*a = *b;
	*b = tmp;
}
int main(){
	int x;
	int y;
	int *p_x;
	int *p_y;
	printf("请输入两个数字：\n");
	scanf("%d", &x);
	scanf("%d", &y);
	p_x = &x;
	p_y = &y;
	swap(p_x,p_y);
	printf("x=%d\n", x);
	printf("y=%d\n", y);
	system("pause");
	return 0;
}*/
//函数的嵌套使用
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void swap(int *p1, int *p2){
	int tmp;
	tmp = *p1;
	*p1 = *p2;
	*p2 = tmp;
}
void exchange(int *pt1, int *pt2, int *pt3){
	if (*pt1 < *pt2)
		swap(pt1, pt2);
	if (*pt1 < *pt3)
		swap(pt1, pt3);
	if (*pt2 < *pt3)
		swap(pt2, pt3);
}
int main(){
	int a, b, c;
	int *p_a, *p_b, *p_c;
	p_a = &a;
	p_b = &b;
	p_c = &c;
	printf("请输入三个数字：\n");
	scanf("%d%d%d", p_a, p_b, p_c);
	exchange(p_a, p_b, p_c);
	printf("a=%d b=%d c=%d\n", a, b, c);
	system("pause");
	return 0;
}