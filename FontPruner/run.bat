@echo off
del /s/q tmp
IF %errorlevel% NEQ 0 echo ɾ��tmp����

set assets=..\..\Assets
set fonts_dir=%assets%\JX3Game\Source\UI\Fonts

python FontPruner.py --inputPath=%assets%\StreamingAssets\lsm --inputPath=%assets%\StreamingAssets\Lua --inputFont=%fonts_dir%\IntroductionFonts.ttf --inputFont=%fonts_dir%\PublicFonts.ttf

IF %errorlevel% NEQ 0 echo ���ɳ���	
pause
