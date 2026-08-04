package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.Tilt.class)
public class Tilt_913659735Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/Tilt;", cancellable = true)
    private static void values__488668132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-488668132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/Tilt;", cancellable = true)
    private static void valueOf_1806261503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806261503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__221800737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221800737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "causesVibration()Z", cancellable = true)
    private void causesVibration_951938317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951938317L))
            info.setReturnValue(null);
    }


}
