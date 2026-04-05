# Config tree in docker
## Purpose
Sample how to use the config tree in docker

## create the secret
echo "mijn-smtp-wachtwoord" > secrets/config.tree.sample/SPRING_MAIL_PASSWORD

## location of project
\\wsl.localhost\Ubuntu\home\mgerrit2\dev\software-projects\config.tree.sample

## location of the secrets
\\wsl.localhost\Ubuntu\home\mgerrit2\dev\software-projects\security\config.tree.sample

## Usefull commands
mkdir -p secrets/config.tree.sample