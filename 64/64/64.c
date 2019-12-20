//位运算操作符
//&这是与运算符对应二进制位均为一时，结果才为一，否则就是0；
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	unsigned result;
	int a, b;
	printf("please input a;");
	scanf("%d", &a);
	printf("please input b:");
	scanf("%d", &b);
	printf("a=%d,b=%d", a, b);
	result = a&b;
	printf("\na&b=%u\n", result);
	system("pause");
	return 0;
}
//"或“运算符|
//只要对应两个二进制有一个位一，结果就为一，
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	unsigned result;
	int a, b;
	printf("please input a;");
	scanf("%d", &a);
	printf("please input b:");
	scanf("%d", &b);
	printf("a=%d,b=%d", a, b);
	result = a|b;
	printf("\na|b=%u\n", result);
	system("pause");
	return 0;
}
//”取反“运算符
//~
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	unsigned result;
	int a;
	printf("please input a:");
	scanf("%d", &a);
	printf("a=%d", a);
	result = ~a;
	printf("\n~a=%o\n", result);
	system("pause");
	return 0;
}
//左移一位相当于乘以2左移两位相当于乘以4
//左移符号<<
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a = 15;
	a = a << 2;
	printf("the result1 is:%d\n", a);
	a = a << 3;
	printf("the result2 is:%d\n", a);
	system("pause");
	return 0;
}//左边高位丢去，右边地位补0；
*/
//右移动时，要注意正负数的问题，当为正数的时候高位补0，为负数的时候高位时补0还是1，取决于编译系统
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a = 30;
	int b = -30;
	a = a >> 3;
	b = b >> 3;
	printf("a=%d\n", a);
	printf("b=%d\n", b);
	system("pause");
	return 0;
}