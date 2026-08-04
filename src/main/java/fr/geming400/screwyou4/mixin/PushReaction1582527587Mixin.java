package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.PushReaction.class)
public class PushReaction1582527587Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private static void values_1692179383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692179383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private static void valueOf__592995622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592995622L))
            info.setReturnValue(null);
    }


}
