package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldgenRandom.Algorithm.class)
public class Algorithm1481217482Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/WorldgenRandom$Algorithm;", cancellable = true)
    private static void values__1945611812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945611812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/WorldgenRandom$Algorithm;", cancellable = true)
    private static void valueOf__345128011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345128011L))
            info.setReturnValue(net.minecraft.world.level.levelgen.WorldgenRandom.Algorithm.XOROSHIRO);
    }

    @Inject(at = @At("HEAD"), method = "newInstance(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void newInstance__481233626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481233626L))
            info.setReturnValue(null);
    }


}
