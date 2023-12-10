public class PCCE7 {
        public int func1(int humidity, int val_set){
            if(humidity < val_set)
                return 3;
            return 1;
        }

        public int func2(int humidity){
            if(humidity >= 50)
                return 0;
            else if (humidity >= 40)
                return 1;
            else if (humidity >= 30)
                return 2;
            else if (humidity >= 20)
                return 3;
            else if (humidity >= 10)
                return 4;
            else
                return 5;
        }

        public int func3(int humidity, int val_set){
            if(humidity < val_set)
                return 1;
            return 0;
        }

        public int solution(String mode_type, int humidity, int val_set) {
            int answer = 0;

            if(mode_type.equals("auto")){
                answer = func2(humidity);
            }
            else if(mode_type.equals("target")){
                answer = func1(humidity, val_set);
            }
            else if(mode_type.equals("minimum")){
                answer = func3(humidity, val_set);
            }

            return answer;
        }
    }

/*
 * 1. 첫번째 시도 실패함,,,,
 *  그에 맞는 숫자를  if(mode_type.equals("auto")){
            answer = func1(23, 45);
        }
        else if(mode_type.equals("target")){
            answer = func2(41);
        }
        else if(mode_type.equals("minimum")){
            answer = func3(10, 34);
        } 넣었을 뿐인데, 실패함
 *
 *
 * 2. (1) return 3인 이유는 auto 결과가 3이라서 이다.
 *      (2) else return 5 인 마지막 남은 조건결과라서 이다.
 *      (3) return 0; 인 이유는 습도가 설정값 이상일 경우 0단계 이기 때문이다.
 *      (4) 영 감이 안 잡히다가 위에 형식이 String 이라는 것을 발견하고 혹시나 싶어서 숫자가 아니라 humidity로 바꾸어 보았는데 성공하였다.
 *          func2는 humidity 만 타입에 들어가서 아래도 똑같이 써주었다.
 *  */