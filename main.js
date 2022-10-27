var seanwesDashboard = function () {
    var UI = {
        $dashboardBody: $('.dashboard-body'),
        $dashboardSidebar: $('.dashboard-sidebar'),
        $dashboardSidebarLink: $('.dashboard-sidebar__link'),
        $dashboardTitle: $('.dashboard-content__header'),
        $subNav: $('.dashboard-sidebar__subnav'),
        $dashboardContentPanel: $('.dashboard-content__panel'),
        sidebarLinkCurrentClass: "dashboard-sidebar__link--current",
        sidebarSubnavHiddenClass: "dashboard-sidebar__subnav--hidden"
    };
    var toggleSubNav = function (item) {
        UI.$subNav.hide();
        item.find(UI.$subNav).show();
    };

    var toggleSidebarCurrent = function (item) {
        var title = item.attr("data-title");
        UI.$dashboardSidebarLink.removeClass(UI.sidebarLinkCurrentClass);
        item.addClass(UI.sidebarLinkCurrentClass);
        toggleSubNav(item);
    };
    var displayDashboardPage = function (id) {
        UI.$dashboardContentPanel.hide();
        $('.dashboard-content__' + id).show();
    };

    var loadDashboardPage = function (item, id, title) {
        UI.$dashboardTitle.text(title);
        displayDashboardPage(id);
    };

    UI.$dashboardSidebarLink.on("click", function () {
        var item = $(this);
        var title = item.attr("data-title");
        var id = item.attr("data-id");
        toggleSidebarCurrent(item);
        loadDashboardPage(item, id, title);
    });

    var initDashboard = function () {
        loadDashboardPage('dashboard', 'dashboard', 'Dashboard');
    };

    return {
        init: function () {
            initDashboard();
        }
    };
}();

$(document).ready(function () {
    seanwesDashboard.init();
});