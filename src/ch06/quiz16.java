package ch06;

public class quiz16 {
    int x=0, y=0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    int weapon = 6; // 공격력
    int armor = 0; // 방어력

    //정답 : weapon, armor   이유: 공격력과 방어력이 같아야 하기때문에 공유해야한다

    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }

}
