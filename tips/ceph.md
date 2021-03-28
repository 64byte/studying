# ROOK/ceph 설치







#### Clean up

---



osd까지 생성이 되었다면 lvm 설정도 지워줘야 한다.

- lvm lvdisplay
  - 리스트가 나타난다면  `lvm lvremove {lv name}`
- lvm vgdisplay
  - 리스트가 나타난다면 `lvm vgremove {vg name}`
