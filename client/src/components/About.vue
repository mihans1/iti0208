<template>
    <div id="a">
        <our-mission/>
        <mission/>
        <about-us/>
        <about/>
        <creators/>
        <authors/>
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
    const about = {
        render(m) {
            return m('p', [
                m('div','TTÜ IT students .')
            ])
        }
    }
    const mission = {
        render(m) {
            return m('p', [
                m('div','Help each others by notifying everybody on things that are happening our streets')
            ])
        }
    }

    const authors = {
        render(m) {
            return m('p', [
                m('div','Mikk, Lauri, Kaidi ' +
                    '2019')
            ])
        }
    }

    export default {
        name: 'About',
        components: {
            ourMission,
            aboutUs,
            creators,
            mission,
            about,
            authors
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