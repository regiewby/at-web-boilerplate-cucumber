# at-web-boilerplate-cucumber

Automation Testing UI Boilerplate with robotframework

## Getting Started

1. Make sure you have Python and PyCharm IDE installed
2. If this is the first launch of PyCharm IDE, you will be prompted to create a virtual environment (venv)
   Make sure that the Base Interpreter option corresponds to your working Python version (Python 3 is recommended)
3. The venv folder should be created. This folder acts in the similar way as node_modules on AT-API folder
4. Open the terminal from the bottom tab of PyCharm. There should be a (venv) prefix before the working directory which means that the venv is working. if it's not, you should to activate the venv first.
   ```
   source venv/bin/activate
   ```
5. Install your dependencies (this command will install every required library from requirements.txt file)

   ```
   pip install -r requirements.txt
   ```

## Create Template

### For MacOS/Linux Users

```
./run-generate-template.sh
```

### For Windows Users

```
./run-generate-template.bat
```

After executing this command, you will be prompted to enter your test case JIRA card number and the folder for the test. <br/>
<b>Note that only test cases with `Feature` tag and `Scenario` tag can be used, so prepare the test case card beforehand </b><br/>

Then, enter this following argument when prompted to enter folder name:

```
<service name>/<feature name>
```

<br/>The folder structure is as following:

    .
    ├── ...
    ├── test                               # Test files
    │    │── pages                         # Pages Object
    │    │── runners                       # TestNg Runner
    │    │── steps                         # Step Definitions
    │    │── features                      # gherkin testcase
    └─ ...   
   
e.g.

```
account/profile_detail
```

The test folder should be created. If more than one test cases are affiliated with similar `Feature` tag, then they will also be added to the test.

## Run Specific Test

### For MacOS/Linux Users

```
./run-android.sh <test relative path>
```

e.g:

```
./run-android.sh __tests__/account/store_list/verify_supplier_status.robot
```

### For Windows Users

```
./run-robot.bat <test relative path>
```

e.g:

```
./run-robot.bat __tests__/account/store_list/verify_supplier_status.robot
```

## Run All Tests for One Feature

### For MacOS/Linux Users

```
./run-android.sh <test relative path, with test name replaced by *>
```

e.g:

```
./run-android.sh __tests__/account/store_list/*.robot
```

### For Windows Users

```
./run-robot.bat <test relative path, with test name replaced by *>
```

e.g:

```
./run-robot.bat __tests__/account/store_list/*.robot
```
