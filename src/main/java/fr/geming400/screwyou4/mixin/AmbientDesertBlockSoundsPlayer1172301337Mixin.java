package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.sounds.AmbientDesertBlockSoundsPlayer.class)
public class AmbientDesertBlockSoundsPlayer1172301337Mixin {
        @Inject(at = @At("HEAD"), method = "playAmbientDeadBushSounds(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void playAmbientDeadBushSounds_1855180223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1855180223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playAmbientDryGrassSounds(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void playAmbientDryGrassSounds_1855180223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1855180223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSandSounds(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void playAmbientSandSounds_1855180223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1855180223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldPlayDesertDryVegetationBlockSounds(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void shouldPlayDesertDryVegetationBlockSounds_1999910669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999910669L))
            info.setReturnValue(true);
    }


}
