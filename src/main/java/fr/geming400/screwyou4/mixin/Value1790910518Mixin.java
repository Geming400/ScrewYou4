package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.Property.Value.class)
public class Value1790910518Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Comparable;", cancellable = true)
    private void value__262257657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262257657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_882284250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882284250L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1733633749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733633749L))
            info.setReturnValue("96i)\u936127\u2F13)`h-!\uBACBh3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1946704687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946704687L))
            info.setReturnValue(1362487476);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void property__1094094768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1094094768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueName()Ljava/lang/String;", cancellable = true)
    private void valueName_1589830235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589830235L))
            info.setReturnValue("fEl\u2C75\u9269\"aK)sW\u68BDVsQk\u59A9aTS_}w%)Kop[Hln9/2k:ci&\uFCB0\uA33F\u6ACCb3b0\u2DC0Bv/ p;N\uA15E59<X\uFC78Y}A%X%\"cs\u0277\u7AEF\uA081*\u501D\uB060\u567F/]fi");
    }


}
