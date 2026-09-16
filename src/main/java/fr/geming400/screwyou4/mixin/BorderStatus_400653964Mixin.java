package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.border.BorderStatus.class)
public class BorderStatus_400653964Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/border/BorderStatus;", cancellable = true)
    private static void values__1966190389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966190389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/border/BorderStatus;", cancellable = true)
    private static void valueOf_379257444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379257444L))
            info.setReturnValue(net.minecraft.world.level.border.BorderStatus.STATIONARY);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_1339556580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1339556580L))
            info.setReturnValue(1566521900);
    }


}
