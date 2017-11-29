# AndroidFragmentAddToBackStack

From `MainActivity`

 1. Replace `Fragment1` + addToBackStack
when back press
`MainActivity` **showing**
 2. Replace `Fragment1` + **without** `addToBackStack`
when back press
MainActivity **finish**



Back button only work with FragmentManager


Example

MainActivity -> Fragment1 (fragment manager) -> Fragment2 (child fragment manager) -> Fragment3 (child fragment manager)
onBackPress
-> MainActivity will show, you can think simple like back press will pop the Fragment1

MainActivity -> Fragment1 (fragment manager) -> Fragment2 (fragment manager) -> Fragment3 (fragment manager)
onBackPress
-> Fragment2 open