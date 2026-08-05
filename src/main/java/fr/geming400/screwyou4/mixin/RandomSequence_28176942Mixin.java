package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.RandomSequence.class)
public class RandomSequence_28176942Mixin {
        @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void random_2015105047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015105047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seedForKey(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/levelgen/RandomSupport$Seed128bit;", cancellable = true)
    private static void seedForKey_983937412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983937412L))
            info.setReturnValue(null);
    }


}
