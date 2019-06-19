package test.parcelernavcomponent

import org.parceler.Parcel

@Parcel(Parcel.Serialization.BEAN)
data class TestModel(var id: Long = 0)