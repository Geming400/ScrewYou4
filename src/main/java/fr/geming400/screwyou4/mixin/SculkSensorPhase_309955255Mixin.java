package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.SculkSensorPhase.class)
public class SculkSensorPhase_309955255Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__825505217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825505217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/SculkSensorPhase;", cancellable = true)
    private static void values__312499108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-312499108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/SculkSensorPhase;", cancellable = true)
    private static void valueOf__1672200001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672200001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__825505217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825505217L))
            info.setReturnValue(null);
    }


}
