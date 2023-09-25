import pygame
import sys
import os

import random

from time import sleep

WHITE = (255,255,255)
BLACK = (0,0,0)

# 게임 기본 세팅
padWidth = 480
padHeight = 640

# 이미지를 저장해놓는 공간
backgrounds = {}
fighters = {}
missiles = {}
monsters = {}

# InGame용 데이터를 담아두는 변수
players = []

# 스폰 관련 변수
enemyPool = []
bulletPool = []


# player 체력 세팅

playerXpos = 0
playerYpos = 0
player_health = 30
score = 0


# 클래스를 저장해놓은 공간?

def readGameResource():
    global backgrounds, fighters, missiles, monsters
    
    # 현재 위치 정의
    current_path = os.path.dirname(__file__)
    
    # 이미지 폴더 위치 정의
    image_custom_path = os.path.join(current_path, "image")
    
    # 예제 폴더 위치 정의
    image_example_path = os.path.join(current_path, "PyShooting")
    
    backgrounds["Desert"] = pygame.image.load(os.path.join(image_custom_path,'background00.png'))
    backgrounds["Sea"] = pygame.image.load(os.path.join(image_custom_path,'background01.png'))
    backgrounds["Mountain"] = pygame.image.load(os.path.join(image_custom_path,'background02.png'))

    fighters["1"] = (pygame.image.load(os.path.join(image_example_path,"fighter.png")))
    fighters["2"] =(pygame.image.load(os.path.join(image_example_path,"rock05.png")))
    fighters["3"] =(pygame.image.load(os.path.join(image_example_path,"rock10.png")))
    fighters["4"] =(pygame.image.load(os.path.join(image_example_path,"rock15.png")))
    fighters["5"] =(pygame.image.load(os.path.join(image_example_path,"rock20.png")))
    
    monsters["1"] = (pygame.image.load(os.path.join(image_example_path,"fighter.png")))
    monsters["2"] = (pygame.image.load(os.path.join(image_example_path,"rock05.png")))
    monsters["3"] = (pygame.image.load(os.path.join(image_example_path,"rock10.png")))
    monsters["4"] = (pygame.image.load(os.path.join(image_example_path,"rock15.png")))
    monsters["5"] = (pygame.image.load(os.path.join(image_example_path,"rock20.png")))
    
    missiles["1"] = (pygame.image.load(os.path.join(image_example_path,"rock01.png")))
    missiles["2"] = (pygame.image.load(os.path.join(image_example_path,"rock02.png")))
    missiles["3"] = (pygame.image.load(os.path.join(image_example_path,"rock03.png")))
    missiles["4"] = (pygame.image.load(os.path.join(image_example_path,"rock04.png")))
    missiles["5"] = (pygame.image.load(os.path.join(image_example_path,"rock05.png")))
    missiles["6"] = (pygame.image.load(os.path.join(image_example_path,"rock06.png")))
    missiles["7"] = (pygame.image.load(os.path.join(image_example_path,"rock07.png")))

# 커스텀 클래스
# 객체 드로잉
def drawObject(obj, x, y):
    global gamePad
    gamePad.blit(obj,(x,y))

def score_update():
    global gamepad
    font = pygame.font.SysFont('malgungothic',35)
    image = font.render(f'  점수 : {score}  HP: {player_health} ', True, (0,255,0))
    pos = image.get_rect()
    pos.move_ip(20,20)
    pygame.draw.rect(image, BLACK,(pos.x-20, pos.y-20, pos.width, pos.height), 2)
    gamePad.blit(image, pos)

def initGame():
    global gamePad, clock
    pygame.init()
    gamePad = pygame.display.set_mode((padWidth,padHeight))
    pygame.display.set_caption("PyShooting")
    
    # 이미지 읽어오기
    readGameResource()
    
    clock = pygame.time.Clock()

def runGame():
    global gamepad, clock
    global backgrounds, fighters, missiles, explosions, rocks


    # InGame 변수
    fighterX = 0
    
    onGame = False
    while not onGame:
        for event in pygame.event.get():
            if event.type in [pygame.QUIT]:
                pygame.quit()
                sys.exit()
        
            # 키 입력 이벤트
            if event.type in [pygame.KEYDOWN]:
                # 종료 키 추가
                if event.key == pygame.K_ESCAPE:
                    onGame = True
                
                # 입력 키 구현
                elif event.key == pygame.K_LEFT:
                    fighterX -= 5
                elif event.key == pygame.K_RIGHT:
                    fighterX += 5
                   
  
            # 키를 띠었을 때 이벤트
            if event.type in [pygame.KEYUP]:
               if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                    fighterX = 0
        
        #update
        
     
        score_update()

        pygame.display.update()
        clock.tick(30)
    pygame.quit()
    sys.exit()
    
initGame()
runGame()
