package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldgenRandom.Algorithm.class)
public class Algorithm1481217482Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/WorldgenRandom$Algorithm;", cancellable = true)
    private static void values__1312062150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312062150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/WorldgenRandom$Algorithm;", cancellable = true)
    private static void valueOf__369498147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-369498147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newInstance(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void newInstance__1353622895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353622895L))
            info.setReturnValue(null);
    }


}
