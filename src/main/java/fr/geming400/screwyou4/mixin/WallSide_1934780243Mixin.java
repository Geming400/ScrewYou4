package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.WallSide.class)
public class WallSide_1934780243Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1589764025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589764025L))
            info.setReturnValue("(Q\u11D8wu@U66}9b>0M:/-=\u869FY7H[;\u48E9e3_'E");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/WallSide;", cancellable = true)
    private static void values_1294433846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294433846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/WallSide;", cancellable = true)
    private static void valueOf__1430154673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430154673L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.WallSide.TALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2022988864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022988864L))
            info.setReturnValue("QE;]x$\u4930\u13C0\u949ESH|\u6B1F\u5D77\u36E3wV*&pqKJEbe#&Fn=v \u62CFvlZjKU\u0B67z<-_@/-0\u510A('");
    }


}
