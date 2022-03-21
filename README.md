# Remote Shell
### Run commands remotely via GitHub
#### Arguments
    * [-s] (optional): Disables the connection during the program's waiting period.
    * <wait_time> : Waiting time to execute the command.
    * <user_git> : GitHub username for a global configuration.
    * <email_git> : GitHub account email for a global configuration.

## Usage
* `rcmd [-s] <wait_time> <user_github> <email_github>`
    #### Examples
    * $ `rcmd -s 3h fabio example@hotmail.com`
    * $ `rcmd 3h fabio example@hotmail.com`
    * \# `sudo rcmd 3h fabio example@hotmail.com` 
    (For a command with root privileges.)
    * You will need to authenticate on github, follow the step by step shown in the terminal.

    * Now just open your githhub with another device, anywhere, and edit or add a command in the **comando** file of the cmd repository (this repository was created when the program was run for the first time, it is a private directory).

## Install
1. `curl -fsSL https://cli.github.com/packages/githubcli-archive-keyring.gpg | sudo dd of=/usr/share/keyrings/githubcli-archive-keyring.gpg`

1. `echo "deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/githubcli-archive-keyring.gpg] https://cli.github.com/packages stable main" | sudo tee /etc/apt/sources.list.d/github-cli.list > /dev/null`

2. `sudo apt update`

2. `wget https://github.com/fabioskb/youtube_downloader/releases/download/Latest/remote-shell_0.0.1-beta_all.deb`

3. `sudo apt install ./remote-shell_0.0.1-beta.deb`
