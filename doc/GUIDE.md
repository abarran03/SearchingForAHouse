# COMMANDS GUIDE 
by, Allan Barrantes H, @abarrantesh



This guide pretends to be a way to access easier to mainly commands for GIT, GITHUB, DOCKER, ETC

## GIT

### setup
``
git -version
``
#### global configuration
``
git config --global user.name "allan"
``
### regular use

#### logs
``
git -log
``
#### logs by number of revisions
``
git log -n5
``
#### logs by date
``
git log --since=2019-01-01
``
#### logs by regular expression
``
git -log --grep="Ini"
``
#### initialize
``
git init
``
#### add all files
``
git add .
``
``
git add file.txt
``
#### commit
``
git commit -m "message" 
``
### Arquitecture
![Screenshot](https://github.com/abarran03/Crud-Sample-Project/blob/first-version/doc/GitArq.PNG)
#### status
``
git status 
``
#### diferencial
``
git diff 
``
``
git diff -staged
``
``
git diff --cached
``
#### jump stage (don't commit unadded files)
``
git commit -a file.txt 
``
``
git commit -all 
``
#### show commit  
``
git show d342398d --color-words
``
#### Diferences between commits  
``
git diff d342398d..93fe2398d --color-words
``
``
git diff d342398d..HEAD --color-words
``
#### How to exit the git log command
``
press Q
``
#### Atomic commit**
``
git -mv file1.txt 
``
#### Undo working copy
``
git checkout -- third_file.txt 
``
#### Undo staged files (soft, mixed, hard)
``
git reset HEAD second_file.txt
``
#### Amend commit (recommit)
``
git commit --amend
``
#### Revert commit
``
git revert 54354t
``
#### Eliminate untracked files
``
git clean -n
``
``
git clean -f
``
#### Ignore files (github ignore templates)
``
add .gitignore 
``
##### Pattern matching
``
*?[aeiou][0-9] 
logs/*.txt
``
##### Negative expressions
``
*?[aeiou][0-9] 
*.php
``
##### Negative expressions
``
*.php
!index.php (not ignore)
``
#### Globally Ignore files
``
git config --global core.excludesfile /.gitignore_global
``
#### Ignore tracked files (remove staged file)
``
git rm --cached file1.txt
``
#### Track empty directories
``
git ls-tree HEAD
``
``
add .gitkeep
``
#### Merge to make a history linear
``
git rebase master
``
#### Dicard local changes
``
git reset --hard
``

## GITHUB

### Flow
![Screenshot](https://github.com/abarran03/Crud-Sample-Project/blob/first-version/doc/GithubFlow.PNG)

#### Clone repository
``
git clone https://github.com/abarran03/merge-conflicts.git
``

#### Create branch
``
git branch my-branch
``
#### Switch to branch
``
git checkout my-branch
``
#### Switch to branch
``
git checkout my-branch
``
#### Add and commit changes
``
git add .
``
``
git commit -m "new version"
``
#### Push files to branch 
``
git push --set-upstream origin my-branch
``

#### Push files to branch | Open pull request
``
git push --set-upstream origin my-branch
``
#### Switch to master
``
git checkout master
``
#### Merge
``
git merge my-branch
``
#### Push merged files
``
git push
``
#### Merge process
> Steps
> >1. Branch: Add
> >2. Branch: Commit
> >3. Branch: Merge origin/master
> >4. Branch: Resolve conflicts
> >5. Branch: Add
> >6. Branch: Commit
> >7. Master: pull
> >8. Master: Merge branch
> >9. Master: Push

## DOCKER

#### Create container from dockerfile
``
docker build -t Crud-Sample-Project .
``
#### List images
``
docker images
``
#### Logs for container
``
docker logs ec-app
``
#### Detail logs container
``
docker inspect ec-app
``
#### List containers
``
docker ps -a
``
#### Run container
``
docker run --name ec-app -p8080:8080 -d crud-sample-project
``

#### Tag Docker Image
``
docker tag DOCKER_USER/name:version
``

#### Push to docker hub
``
docker push DOCKER_USER/name:version
``

#### Login 
``
docker login
``
#### Generate new jar
``
mvnw package && java -jar target/searchinghouses-0.0.1-SNAPSHOT.jar
``
#### containazer app application
``
docker build -t api-java-mongo .
``
#### Know ip adress 
``
docker tag ghost2103/api-java-mongo
``
#### push image 
``
docker push ghost2103/api-java-mongo
``
#### Know ip adress 
``
docker-machine ip
``
#### run docker compose
``
docker-compose up
``
