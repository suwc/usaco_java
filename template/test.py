import glob
import os
import re
import sys

def readFile(fileName):
    return open(fileName, "r").read()

def match(fileName1, fileName2):
    file1 = re.sub(r'\r\n', '\n', readFile(fileName1))
    file2 = re.sub(r'\r\n', '\n', readFile(fileName2))
    return file1 == file2

if os.system('javac Main.java') != 0:
    print("\nBuild error!!!")
    exit(-1)

files = glob.glob('./*.in')

for file in files:
    outputFile = file.replace('.in', '.out.actual')
    baselineFile = file.replace('.in', '.out')
    cmd = f'java Main < {file} > {outputFile}'
    sys.stdout.write(file)
    if os.system(cmd) != 0:
        print("\nRuntime error!!!")
        exit(-1)

    if (os.path.isfile(baselineFile)):
        if (match(outputFile, baselineFile)):
            print("\tPassed")
        else:
            print("\tFailed")
    else:
        print("\tCompleted")
