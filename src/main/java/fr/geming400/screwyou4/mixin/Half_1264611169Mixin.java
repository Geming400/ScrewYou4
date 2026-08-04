package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.Half.class)
public class Half_1264611169Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_129150697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129150697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/Half;", cancellable = true)
    private static void values_1867690736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1867690736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/Half;", cancellable = true)
    private static void valueOf__132346925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-132346925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_129150697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129150697L))
            info.setReturnValue(null);
    }


}
