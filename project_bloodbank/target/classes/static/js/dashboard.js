// Messages rotation
const messages = [
  "The most significant advantage of donating blood is the opportunity to save lives. A single blood donation can help up to three people in need of transfusions due to accidents, surgeries, childbirth complications, or medical conditions like anemia and cancer. Donated blood is a critical resource that hospitals rely on daily. When you donate, you're directly contributing to someone’s survival—no exaggeration, just fact.",
  "Donating blood isn’t just good for recipients—it can also benefit the donor. Regular blood donation helps maintain healthy iron levels, which may reduce the risk of heart disease caused by iron overload. Additionally, each donation involves a mini-health check (blood pressure, pulse, hemoglobin levels), which can help catch potential health issues early. It's not a replacement for a full check-up, but it's still a useful",
  "Blood donation fosters a sense of community and responsibility. It’s a small, selfless act that connects you to others in a meaningful way. In times of crisis—natural disasters, accidents, or shortages—blood donors become silent lifelines. Knowing that your action has made a tangible difference gives a sense of fulfillment and encourages a more compassionate society."
];
let msgIndex = 0;
const msgSlider = document.getElementById('msgSlider');
function rotateMessages() {
  msgSlider.textContent = messages[msgIndex];
  msgIndex = (msgIndex + 1) % messages.length;
}
rotateMessages();
setInterval(rotateMessages, 20000);

// Background rotation
const backgrounds = [
  '../images/bloode1.jpg',
  '../images/bloode2.jpg',
  '../images/bloode3.jpg'
];
let bgIndex = 0;
setInterval(() => {
  document.body.style.backgroundImage = `url(${backgrounds[bgIndex]})`;
  bgIndex = (bgIndex + 1) % backgrounds.length;
}, 40000);

// Search donors by blood group
const searchInput = document.getElementById('searchInput');
const leaderboardContent = document.getElementById('leaderboardContent');

async function fetchDonors(group = '') {
  try {
    const res = await fetch(`../PHP/donor_list.php?group=${encodeURIComponent(group)}`);
    const html = await res.text();
    leaderboardContent.innerHTML = html;
  } catch {
    leaderboardContent.textContent = "Failed to load donors.";
  }
}
fetchDonors();

let debounceTimeout;
searchInput.addEventListener('input', () => {
  clearTimeout(debounceTimeout);
  debounceTimeout = setTimeout(() => {
    fetchDonors(searchInput.value.trim());
  }, 400);
});

// Fetch hospital requests
async function fetchHospitalRequests() {
  try {
    const res = await fetch('../PHP/hospital_requests_list.php');
    const html = await res.text();
    document.getElementById('hospitalRequestsContent').innerHTML = html;
  } catch {
    document.getElementById('hospitalRequestsContent').textContent = "Failed to load requests.";
  }
}
fetchHospitalRequests();
