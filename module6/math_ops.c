#include <stdio.h>

void print_math(int a, int b) {
    int sum = a + b;
    int product = a * b;

    printf("Sum: %d\n", sum);
    printf("Product: %d\n", product);
}

int main(void) {
    int first, second;

    printf("Enter first number: ");
    scanf("%d", &first);

    printf("Enter second number: ");
    scanf("%d", &second);

    print_math(first, second);

    return 0;
}
