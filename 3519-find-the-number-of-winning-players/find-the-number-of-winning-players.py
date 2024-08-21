class Solution:
    def winningPlayerCount(self, n: int, pick: List[List[int]]) -> int:
        # [선수, 공의 색상]
        # 0번째 선수는 아무 공을 골라도 승리
        # i번째 선수는 앞 선수가 고른 공과 같은 색의 공을 i+1개 이상 골라야 승리

        # 이길 수 있는 선수의 수
        winning_player = 0

        # 각 선수마다 고른 공의 색상별로 개수를 저장할 리스트
        player_balls = [{} for _ in range(n)]
        
        # 각 선수의 공 색상 카운트
        for player, color in pick:
            if color in player_balls[player]:
                player_balls[player][color] += 1
            else:
                player_balls[player][color] = 1
       
        # 각 선수의 승리 조건을 확인
        for i in range(n):
            
            # i번째 선수가 고른 공 중 같은 색 공이 i+1개 이상인지 확인
            if any(count >= i + 1 for count in player_balls[i].values()):
                winning_player += 1
        
        return winning_player