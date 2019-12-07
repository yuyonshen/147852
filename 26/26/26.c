#include<stdio.h>
#include<stdlib.h>//´òÓ¡×Ö·û´®
int main(){
	char arr1[] = "l like beijing.";
	char arr2[] = "###############";
	int left = 0;
	int right = strlen(arr1) - 1;
	printf("%s\n", arr2);
	while (left <= right){
		
		arr2[left] = arr1[right];
		arr2[right] = arr1[left];
		left++;
		right--;
		printf("%s\n", arr2);
	}
	system("pause");
	return 0;
}
