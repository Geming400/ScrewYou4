package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.border.BorderStatus.class)
public class BorderStatus_400653964Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/border/BorderStatus;", cancellable = true)
    private static void values_868327593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868327593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/border/BorderStatus;", cancellable = true)
    private static void valueOf__1082651508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082651508L))
            info.setReturnValue(net.minecraft.world.level.border.BorderStatus.STATIONARY);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_438916209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438916209L))
            info.setReturnValue(-1939052035);
    }


}
