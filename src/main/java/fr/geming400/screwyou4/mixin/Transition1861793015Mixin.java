package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Portal.Transition.class)
public class Transition1861793015Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private static void values_1947654315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947654315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private static void valueOf_622762766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622762766L))
            info.setReturnValue(null);
    }


}
