# CSC365Lab7

## Instructions for workspace

### Create new issue

* Click on the issues tab
* Click new issue
* Enter a title for what you will be working
* Naming convention for title and branch naming will be "Making-A-Function-For-SQL"
* Enter a description explaining what it is you will be working on for the branch
* Click create



### Creating a new branch

1) Make sure in master using git branch
```
$ git branch
```

2) Before creating a new branch, pull the changes from upstream. Your master needs to be up to date.
```
$ git pull
```

3) Create the branch on your local machine and switch in this branch :
```
$ git checkout -b [name_of_your_new_branch]
```

4) Push the branch on github :
```
$ git push origin [name_of_your_new_branch]
```

By this point you will have created an issue on github, Created a branch on local machine, and pushed that branch to github.

If you navigate to github main page of CSC365Lab7 you will see a the branch name master with an arrow.
If you click on that you will see all branchs that have been and you should be able to see the new branch you just made.

5) When you make changes locally and need to push changes to your branch use
* MAKE SURE ARE IN YOUR BRANCH AND NOT MASTER
```
$ git add .
$ git commit -m "Brief message explaining what this commit is "
$ git push origin [name_of_your_new_branch]
```

### Making pull Request

