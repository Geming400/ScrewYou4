package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.sounds.AmbientDesertBlockSoundsPlayer.class)
public class AmbientDesertBlockSoundsPlayer1172301337Mixin {
        @Inject(at = @At("HEAD"), method = "playAmbientDeadBushSounds(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void playAmbientDeadBushSounds__917308813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-917308813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playAmbientDryGrassSounds(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void playAmbientDryGrassSounds_190269970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(190269970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSandSounds(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void playAmbientSandSounds__1781793141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1781793141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldPlayDesertDryVegetationBlockSounds(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void shouldPlayDesertDryVegetationBlockSounds_1807892121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807892121L))
            info.setReturnValue(false);
    }


}
