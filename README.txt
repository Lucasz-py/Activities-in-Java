git add .
git commit -m "Cambios"
git push

git pull   # trae lo último del repo
# haces cambios...
git add .
git commit -m "Cambios"
git push

# Forzar actualizacion 
git fetch origin
git reset --hard origin/main
