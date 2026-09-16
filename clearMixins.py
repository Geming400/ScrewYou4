import os
import shutil

mixinPath = r"src\main\java\fr\geming400\screwyou4\mixin"
foundMethodsFile = r"src\main\java\fr\geming400\screwyou4\FoundMethods.java"

if os.path.isdir(mixinPath):
    print("Deleting mixin folder")
    shutil.rmtree(mixinPath)

    print("Recreating mixin folder")
    os.makedirs(mixinPath)

    print("Finished !")
else:
    print("Cannot delete anything since the mixin folder doesn't exist !")

if os.path.isfile(foundMethodsFile):
    print("Deleting FoundMethods.java file")
    os.remove(foundMethodsFile)

    print("Finished ! Generator will recreate that file")
else:
    print("Cannot delete anything since the FoundMethods.java file doesn't exist !")