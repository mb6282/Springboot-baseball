### MariaDB 사용자 생성 및 권한 주기 (root에서 green에게 권한 부여)
```sql
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE baseball;
GRANT ALL PRIVILEGES ON baseball.* TO 'green'@'%';
```

### 테이블 생성
```sql
USE baseball;

DROP table stadium;
DROP table team;
DROP table player;
DROP table expulsion;

create table stadium(
    id int primary KEY auto_increment,
    stadiumName varchar(100) UNIQUE not null,
    createDate TIMESTAMP
);

create table team(
    id int primary KEY auto_increment,
    stadiumId int,
    teamName varchar(100) UNIQUE not null,
    createDate TIMESTAMP
);

create table player(
    id int primary KEY auto_increment,
    playerName varchar(100) UNIQUE not null,
    teamId int,
    position varchar(100) not null,
    createDate TIMESTAMP
);

create table expulsion(
    id int primary KEY auto_increment,
    reason varchar(100) unique not null,
    playerId int,
    createDate TIMESTAMP
);
```

### 제약조건
```sql
alter table team add constraint fk_stadiumId foreign key
(stadiumId) references stadium (id)
on delete cascade;

alter table player add constraint fk_teamId foreign key
(teamId) references team (id)
on delete cascade;

alter table expulsion add constraint fk_playerId foreign key
(playerId) references player (id)
on delete cascade;
```

### 더미데이터 추가
```sql
INSERT into stadium(stadiumName,createDate)
VALUES("사직야구장",now());
INSERT into stadium(stadiumName,createDate)
VALUES("구덕야구장",now());
INSERT into stadium(stadiumName,createDate)
VALUES("잠실야구장",now());

INSERT into team(stadiumId,teamName,createDate)
VALUES("1","두산",now());
INSERT into team(stadiumId,teamName,createDate)
VALUES("2","NC",now());
INSERT into team(stadiumId,teamName,createDate)
VALUES("3","롯데",now());

INSERT into player(playerName,teamId,position,createDate)
VALUES("김민재",1,"타자",now());
INSERT into player(playerName,teamId,position,createDate)
VALUES("채지선",1,"투수",now());
INSERT into player(playerName,teamId,position,createDate)
VALUES("알칸타라",1,"외야수",now());


INSERT into player(playerName,teamId,position,createDate)
VALUES("손민한",2,"타자",now());
INSERT into player(playerName,teamId,position,createDate)
VALUES("루친스키",2,"투수",now());
INSERT into player(playerName,teamId,position,createDate)
VALUES("박석민",2,"내야수",now());


INSERT into player(playerName,teamId,position,createDate)
VALUES("오윤석",3,"타자",now());
INSERT into player(playerName,teamId,position,createDate)
VALUES("박세웅",3,"투수",now());
INSERT into player(playerName,teamId,position,createDate)
VALUES("오태근",3,"내야수",now());
COMMIT;
```