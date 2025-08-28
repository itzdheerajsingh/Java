<div class="container">
    <div class="header-content">
        <h1 class="typing-effect">Daily Java Practice</h1>
        <p class="subtitle">My journey through coding exercises and challenges.</p>
    </div>
    <div class="links">
        <a href="#code" class="button">Explore the Code</a>
    </div>
</div>

<style>
    :root {
        --bg-color: #121212;
        --text-color: #f0f0f0;
        --accent-color: #1a73e8; /* A vibrant blue for links */
        --subtle-color: #888;
        --font-family: 'Fira Code', 'Roboto Mono', monospace;
    }

    /* Use a simple container for centered content */
    .container {
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        text-align: center;
        padding: 50px 20px;
        min-height: 400px;
        background-color: var(--bg-color);
        font-family: var(--font-family);
        color: var(--text-color);
        border-radius: 12px;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.5);
        position: relative;
        overflow: hidden;
    }

    /* Subtle Animated Background */
    .container::before {
        content: '';
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: radial-gradient(circle, #333, transparent 50%),
                    radial-gradient(circle at 100% 100%, #333, transparent 50%);
        background-size: 50% 50%;
        animation: move-bg 20s infinite linear;
        opacity: 0.1;
    }

    @keyframes move-bg {
        0% { transform: translate(0, 0); }
        100% { transform: translate(100%, 100%); }
    }

    /* Typing Animation for the title */
    .typing-effect {
        font-size: 3em;
        font-weight: bold;
        color: var(--text-color);
        white-space: nowrap;
        overflow: hidden;
        border-right: 3px solid var(--accent-color);
        animation: typing 3s steps(22, end), blink-caret 0.75s step-end infinite;
        text-shadow: 0 0 10px rgba(255, 255, 255, 0.2);
    }

    @keyframes typing {
        from { width: 0; }
        to { width: 100%; }
    }

    @keyframes blink-caret {
        from, to { border-color: transparent; }
        50% { border-color: var(--accent-color); }
    }

    .subtitle {
        font-size: 1.2em;
        color: var(--subtle-color);
        margin-top: 10px;
        opacity: 0;
        animation: fade-in 1s ease-in 3.5s forwards;
    }

    @keyframes fade-in {
        to { opacity: 1; }
    }

    /* Stylish Button */
    .links {
        margin-top: 30px;
        opacity: 0;
        animation: fade-in 1s ease-in 4s forwards;
    }
    
    .button {
        display: inline-block;
        padding: 12px 24px;
        background-color: var(--accent-color);
        color: #fff;
        text-decoration: none;
        border-radius: 8px;
        font-weight: bold;
        transition: transform 0.3s ease, background-color 0.3s ease;
    }

    .button:hover {
        background-color: #1764ce;
        transform: translateY(-3px);
    }

    /* Media queries for smaller screens */
    @media (max-width: 600px) {
        .typing-effect {
            font-size: 2em;
        }
        .subtitle {
            font-size: 1em;
        }
    }
</style>
