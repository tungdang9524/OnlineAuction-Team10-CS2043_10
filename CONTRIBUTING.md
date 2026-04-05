# Contributing Guidelines

This document defines the workflow and rules for contributing to the project.

---

## 1. Branch Naming Convention

All work must be done on separate branches. Do NOT commit directly to `main`.

Branch naming format:

- feat/<short-description>       # new feature
- fix/<short-description>        # bug fix
- docs/<short-description>       # documentation
- test/<short-description>       # testing
- refactor/<short-description>   # code improvement
- chore/<short-description>      # maintenance

Examples:

- feat/setup-github-actions
- docs/add-repo-rules
- test/add-week1-test-plan

---

## 2. Commit Message Convention

We follow a simplified Conventional Commits format:

<type>: <short description>

Types:

- feat:     new feature
- fix:      bug fix
- docs:     documentation changes
- test:     add or update tests
- refactor: code restructuring (no new feature)
- chore:    minor tasks, config, cleanup

Examples:

- feat: add github actions workflow
- docs: add contributing guidelines
- test: add week1 test plan draft

---

## 3. Pull Request Workflow

- Do NOT push directly to `main`
- Always create a new branch for each task
- Open a Pull Request (PR) before merging
- PR title should follow commit convention
- At least one team member should review before merge

---

## 4. General Rules

- Commit frequently to show progress
- Write clear and meaningful commit messages
- Make sure the project builds successfully before pushing
- All members must understand the code they contribute

---

## 5. CI Requirement

- GitHub Actions must pass before merging
- Build command used in CI: `mvn clean test`

---