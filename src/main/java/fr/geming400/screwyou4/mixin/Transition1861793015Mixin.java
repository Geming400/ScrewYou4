package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Portal.Transition.class)
public class Transition1861793015Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private static void values_388671437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388671437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private static void valueOf__1549605658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549605658L))
            info.setReturnValue(net.minecraft.world.level.block.Portal.Transition.CONFUSION);
    }


}
