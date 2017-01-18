#!/bin/sh
rm -rf tmp
mkdir tmp

assets="../../Assets"
fonts_dir="${assets}/JX3Game/Source/UI/Fonts"
python FontPruner.py --inputPath  ../../UIPrefab2Txt --inputPath=${assets}/StreamingAssets/lsm --inputPath=${assets}/StreamingAssets/Lua --inputFont=${fonts_dir}/IntroductionFonts.ttf --inputFont=${fonts_dir}/PublicFonts.ttf
read -p "press any key"
echo ¼ÌÐøÔËÐÐ

