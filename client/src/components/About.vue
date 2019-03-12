<template>
    <div id="a">
        <our-mission/>
        <lorem-ipsum/>
        <about-us/>
        <lorem-ipsum/>
        <creators/>
        <lorem-ipsum/>
    </div>

</template>

<script>
    const ourMission = {
        render(m) {
            return m('div', [
                m('h1', 'OUR MISSION')
            ])
        }
    }
    const aboutUs = {
        render(m) {
            return m('div', [
                m('h1', 'ABOUT US')
            ])
        }
    }
    const creators = {
        render(m) {
            return m('div', [
                m('h1', 'CREATORS')
            ])
        }
    }
    const loremIpsum = {
        render(m) {
            return m('p', [
                m('div','Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')
            ])
        }
    }
    export default {
        name: 'About',
        components: {
            ourMission,
            aboutUs,
            creators,
            loremIpsum
        },
    }

</script>

<style scoped>
    #a {
        text-align: center;
        font-size: large;
    }

    p {
        max-width: 900px;
        margin: auto;
        font-size: medium;
    }

</style>