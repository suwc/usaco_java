## Install software
1. [VS Code](https://code.visualstudio.com/download)
2. [GIT](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) (Install GIT optional unix tools if you use Windows without WSL.)
3. [Open JDK](https://learn.microsoft.com/en-us/java/openjdk/install)
4. [Python](https://www.python.org/downloads/) (for running automated tests)
5. (optional) [Tkdiff](https://sourceforge.net/projects/tkdiff/files/tkdiff/4.3.5/)

## Prepare your local repo

```
git clone https://github.com/suwc/usaco_java
cd usaco_java
```

## Create a directory for a new problem

```
cp -R template newProblem
```

## Run automated tests

All files ending with '.in' are treated as test input files. The output of each test is stored in '<name>.out.actual' and compared with '<name>.out' with three possible outcomes:
1. Passed: the actual output matches with the expected output.
2. Failed: the actual output does not match with the expected output.
3. Completed: the expected output file does not exist.
```
cd newProblem
python test.py
```
We expect to see something like:
```
.\00.in Passed
```

## Debug in VS Code
1. Open `problem/Main.java` in VS Code. (Note: the first time you do this, VS Code will prompt you to install "Extension Pack for Java" and "Debugger for Java".)
2. Press F5 to debug; press Ctrl-F5 to run the code without attaching the debugger. (Note: if PowerShell in VS Code complains about '<', [switch to cmd.exe](https://stackoverflow.com/a/43751743/23072920) )
3. To debug a different test than "00.in" or to use the terminal for input during debug, update or comment out the following line in `.vscode\launch.json`:

   `       "args": ["<", "00.in"],`
