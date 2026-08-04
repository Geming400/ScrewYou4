package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.RandomSequence.class)
public class RandomSequence_28176942Mixin {
        @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void random__2021447942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021447942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seedForKey(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private static void seedForKey_154363851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154363851L))
            info.setReturnValue(null);
    }


}
