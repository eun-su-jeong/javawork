package ex11_03;

class NumberController {
    public boolean check(int num1, int num2) throws NumRangeException {
    	if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
            throw new NumRangeException("1~100 사이의 값만 입력할 수 있습니다.");
        }
        return num1 % num2 == 0;
    }
}