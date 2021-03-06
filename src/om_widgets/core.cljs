(ns om-widgets.core
  (:require [om-widgets.textinput]
            [om-widgets.checkbox]
            [om-widgets.dropdown]
            [om-widgets.navbar]
            [om-widgets.datepicker]
            [om-widgets.radiobutton]
            [om-widgets.combobox]
            [om-widgets.grid]
            [om-widgets.modal-box]
            [om-widgets.button]
            [om-widgets.tab]
            [om-widgets.page-switcher]
            [om-widgets.popover]
            [om-widgets.slider]
            [om-widgets.switcher]
            [om-widgets.editable-list-view]
            [om-widgets.utils]))

(def textinput om-widgets.textinput/textinput)
(def checkbox om-widgets.checkbox/checkbox)
(def dropdown om-widgets.dropdown/dropdown)
(def navbar om-widgets.navbar/navbar)
(def datepicker om-widgets.datepicker/datepicker)
(def radiobutton om-widgets.radiobutton/radiobutton)
(def radiobutton-group om-widgets.radiobutton/radiobutton-group)
(def switcher om-widgets.switcher/switch)
(def combobox om-widgets.combobox/combobox)
(def button om-widgets.button/button)
(def grid om-widgets.grid/grid)
(def tab om-widgets.tab/tab)
(def popover om-widgets.popover/popover)
(def slider om-widgets.slider/slider)

(def install-modal-box! om-widgets.modal-box/install-modal-box!)
(def alert om-widgets.modal-box/alert)
(def ok-cancel om-widgets.modal-box/ok-cancel)
(def do-modal om-widgets.modal-box/do-modal)
(def modal-launcher  om-widgets.modal-box/modal-launcher)

(def page-switcher om-widgets.page-switcher/page-switcher)
(def editable-list-view om-widgets.editable-list-view/editable-list-view)
(def om-get om-widgets.utils/om-get)
(def om-update! om-widgets.utils/om-update!)
