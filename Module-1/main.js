console.log("Welcome to the Community Portal");
window.onload = () => alert("Page loaded successfully");

// Confirm form submission
document.getElementById("registrationForm").addEventListener("submit", function (e) {
  e.preventDefault();
  document.getElementById("outputMsg").value = "Registration submitted successfully!";
  const eventType = document.getElementById("eventType").value;
  localStorage.setItem("preferredEvent", eventType);
});

// Load preferences
window.addEventListener("load", () => {
  const pref = localStorage.getItem("preferredEvent");
  if (pref) {
    document.getElementById("eventType").value = pref;
    showFee(document.getElementById("eventType"));
  }
});

// Clear preferences
function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
  alert("Preferences cleared.");
}

// Show fee
function showFee(el) {
  const fees = { music: "$10", art: "$20", sports: "$15" };
  document.getElementById("feeDisplay").innerText = `Fee: ${fees[el.value] || ""}`;
}

// Phone number validation
function validatePhone(el) {
  const regex = /^\d{10}$/;
  if (!regex.test(el.value)) {
    alert("Enter a valid 10-digit phone number.");
    el.focus();
  }
}

// Count characters
function countChars(el) {
  document.getElementById("charCount").innerText = `Characters: ${el.value.length}`;
}

// Enlarge image on double click
function enlargeImage(img) {
  img.style.transform = "scale(1.5)";
  img.style.transition = "transform 0.3s ease";
}

// Video ready message
function videoReady() {
  document.getElementById("videoMsg").innerText = "Video ready to play!";
}

// Geolocation
function findNearbyEvents() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(
      pos => {
        const { latitude, longitude } = pos.coords;
        document.getElementById("geoOutput").innerText = `Latitude: ${latitude}, Longitude: ${longitude}`;
      },
      err => {
        document.getElementById("geoOutput").innerText = `Error: ${err.message}`;
      },
      { enableHighAccuracy: true, timeout: 5000 }
    );
  } else {
    alert("Geolocation is not supported by your browser.");
  }
}

// Warn on form page unload
window.onbeforeunload = function () {
  return "Are you sure you want to leave? Your form may not be saved.";
};
