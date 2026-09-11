# Personality Reflection Hub

A clinically-informed, stigma-sensitive mental health psychoeducation Android application built for the Indian public, under the clinical direction of **Dr. Vidhi Pareekh**, MD Psychiatry, and **Dr. Raghav Suthar**, DNB Psychiatry resident at the Gujarat Institute of Mental Health (GIMH), Ahmedabad.

Built with modern **Kotlin**, **Jetpack Compose**, and **Material 3**.

---

## Core Philosophy: Reflect & Educate — Never Diagnose

1. **Never Diagnose**: The app does not provide clinical diagnoses or labels. It offers structured psychoeducation and reflective tools based on the dimensional model.
2. **WHO ICD-11 Dimensional Framework**: Focuses on continuous personality traits and functional impact rather than rigid categorical disorders.
3. **100% Privacy by Design**: Zero network calls, zero tracking, zero analytics. All assessments and inputs remain strictly on-device.
4. **Trilingual Support**: Fully localized in English, Hindi (हिंदी), and Gujarati (ગુજરાતી).
5. **Prominent Safety & Helplines**: Dedicated crisis access to Tele-MANAS (14416), Emergency (112), and national helplines.

---

## Features

- **Self-Reflection Assessment**: 30-item dimensional exploration across 5 ICD-11 domains (Negative Affectivity, Detachment, Dissociality, Disinhibition, Anankastia) and Borderline pattern specifier with positive reframing.
- **Understand Patterns**: Detailed educational guides on personality dimensions, severity levels, common myths vs. facts, and the transition from DSM-5 categories to ICD-11 dimensions.
- **Caregiver Hub**: Practical guidance for family members and partners, featuring communication scripts, setting boundaries without guilt, and identifying safety warning signs.
- **Crisis & Helplines**: Verified 24/7 national emergency contacts and mental health support services with one-tap dialing.
- **Colorful Pastel Tile Navigation**: Clean, intuitive 2-column home grid with high-contrast, eye-safe styling.

---

## Get the App

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/personality-reflection-hub.git
cd personality-reflection-hub
```

### 2. Build Locally
To build the debug APK using Gradle:
```bash
./gradlew assembleDebug
```
The APK will be generated at `app/build/outputs/apk/debug/app-debug.apk`.

### 3. Downloading the APK from GitHub

The repository includes an automated GitHub Actions workflow (`.github/workflows/build-release.yml`) that builds the APK automatically.

#### Option A: Download directly from GitHub Actions (No tag needed)
1. Go to your GitHub repository in your browser.
2. Click on the **Actions** tab at the top.
3. In the left sidebar, select **Build and Download APK** (or click the latest workflow run on the list).
   *(You can also click **Run workflow** -> **Run workflow** to trigger a build manually at any time!)*
4. Click on the completed workflow run.
5. Scroll down to the **Artifacts** section at the bottom of the summary page.
6. Click **PersonalityReflectionHub-APK** to download the ZIP file containing `app-debug.apk` directly to your computer or phone.

#### Option B: Download from GitHub Releases (Tagged Releases)
Whenever a version tag (`v*`) is pushed:
```bash
git tag v1.0.0
git push origin v1.0.0
```
GitHub Actions will automatically compile the APK and attach `app-debug.apk` directly to the GitHub **Releases** page (`https://github.com/<your-username>/<repo>/releases`), where anyone can download it with a single click.

### Versioning Rules
For every future release, adhere to standard Semantic Versioning:
1. Open `app/build.gradle.kts`.
2. Increment `versionCode` by 1 (e.g., `1` -> `2`).
3. Update `versionName` to the new version string (e.g., `"1.0.0"` -> `"1.0.1"` or `"1.1.0"`).
4. Update `CHANGELOG.md` with the new version notes.
5. Commit, tag with matching `vX.Y.Z`, and push the tag.

---

## License & Clinical Disclaimer

This application is created solely for public mental health literacy, psychoeducation, and family support. It does not establish a doctor-patient relationship, nor does it replace professional evaluation by a qualified psychiatrist or clinical psychologist.
