# 작물 병충해 이미지 분류 서비스 CropsDoctor

## Overview
<p align="center"><img src="https://ifh.cc/g/DYgWPS.png" height="300px"></img></p>


**CropsDoctor**는 Tensorflow Lite Java API를 사용하여 안드로이드 플랫폼 상에서 
작물 이미지 분류를 통해 병충해 진단과 방제법을 제공하는 서비스입니다. 
본 서비스는 프레임별 작물 이미지를 실시간으로 분석하여 작물이 감염된 병충해를 표시하고 사용자는 해당 병충해와 관련된 정보와 방제법을 얻을 수 있습니다. 
병충해와 관련된 정보는 [농사로](http://t2m.kr/pV4Xv)를 참고하였습니다. 

## Requirements

-   Android Studio 4.0
- [개발자 모드](https://developer.android.com/studio/debug/dev-options?hl=ko)가 활성화된 안드로이드 장치

## Project Details
<p align="center"><img src="https://ifh.cc/g/0KfgL1.png" width="500px"></p>

- 총 5종의 작물에 대한 34종의 병충해 데이터셋을 수집([데이터셋 다운로드 방법](https://teddylee777.github.io/kaggle/Kaggle-API-%EC%82%AC%EC%9A%A9%EB%B2%95))
```
kaggle datasets download -d herbwood27/crop-disease-dataset
```

- data augmentation 및 데이터 전처리 진행
- **EfficientNet** 모델을 통해 분류 모델 학습
- Tensorflow Lite를 통해 산출된 `model.tflite`, `labels.txt` 를 `app/src/main/assets` 디렉터리에 포함시켜  학습된 모델과 label을 load시킴


## Build and run

### Step 1. 원격 저장소 git clone

```
git clone https://github.com/herbwood/crops_doctor.git
```

<p align="center"><img src="https://ifh.cc/g/0UnbcI.jpg" width="500px"></p>

Android Studio에서 `Open an existing project`를 선택하고 원격 저장소에서 다운받은 `app` 디렉터리 선택합니다.


### Step 2. Run App
<p align="center"><img src="https://ifh.cc/g/n74qho.jpg" width="500px"></p>

- 안드로이드 기기를 컴퓨터에 연결합니다. 
- Android Studio에서 `Run` 섹션을 선택하고  ` Run app` 을 눌러 앱을 실행시킵니다. 
- [Android Emulator에서 앱 실행]([https://developer.android.com/studio/run/emulator?hl=ko](https://developer.android.com/studio/run/emulator?hl=ko))을 통해 Android Studio 내에서 앱 실행 화면을 확인할 수 있습니다. 



### Step 3. 앱 실행시켜보기
<p align="center"><img src="https://ifh.cc/g/ya8sXb.jpg" height="400px"></img></p>

- 앱을 테스트하기 위해서 안드로이드 장치에 다운로드된 `CropDoctor` 앱을 클릭합니다. 앱을 처음으로 실행시킬 때 카메라 접근에 대한 허가를 요청할 것입니다. 
- `방제 방법 알아보기`버튼을 누르면 작물의 병충해에 대한 정보와 방제법을 확인할 수 있습니다. 
