//auto和static修饰的变量之间的区别
//auot自动变量
//static静态变量
#include<stdio.h>
#include<stdlib.h>
void Addone(){//第一次运行完成自动释放空间
	auto int a = 1;
	 a = a + 1;
	printf("%d\n", a);
}
int  main(){
	printf("调用第一次");//2
	Addone();
	printf("调用第二次");//2
	Addone();
	system("pause");
	return 0;
}
void Add(){//static 静态变量，第一次运行完成之后值保存下来对二次运行时使用第一次的保存下来的值
	static int num = 20;
	num = num + 10;
	printf("num=%d\n", num);
}
int main(){
	printf("第一次调用");//30
		Add();
		printf("第二次调用");//40
		Add();
		system("pause");
		return 0;
}
//register修饰的变量提高运行速度
int  one(){
	register int tmp = 100;
	int num;
	num = tmp + 10;
	return num;
}
void main(){
	printf("%d\n", one());
	system("pause");
}