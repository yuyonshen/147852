//auto��static���εı���֮�������
//auot�Զ�����
//static��̬����
#include<stdio.h>
#include<stdlib.h>
void Addone(){//��һ����������Զ��ͷſռ�
	auto int a = 1;
	 a = a + 1;
	printf("%d\n", a);
}
int  main(){
	printf("���õ�һ��");//2
	Addone();
	printf("���õڶ���");//2
	Addone();
	system("pause");
	return 0;
}
void Add(){//static ��̬��������һ���������֮��ֵ���������Զ�������ʱʹ�õ�һ�εı���������ֵ
	static int num = 20;
	num = num + 10;
	printf("num=%d\n", num);
}
int main(){
	printf("��һ�ε���");//30
		Add();
		printf("�ڶ��ε���");//40
		Add();
		system("pause");
		return 0;
}
//register���εı�����������ٶ�
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