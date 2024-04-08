export class EvenOrOdd {
    evenOrOdd(n: number): string {
        const result = n % 2;
        if (result == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}

