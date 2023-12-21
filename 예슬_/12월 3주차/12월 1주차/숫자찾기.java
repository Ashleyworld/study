
function solution(num, k) {
        const newnum = String(num)
        let answer = 0;

        answer = newnum.indexOf(String(k)) + 1
        if (answer == 0 ) {
        answer = answer - 1
        }
        return answer;
        }
        const res = solution(123456, 7)

        console.log(res)

/*
* int answer는 a의 길이, 입력된 예씨는 abcde 그래서 answer = 5
*    i는 5만큼 돌아가고
*   println 한다. a를 5개
* */