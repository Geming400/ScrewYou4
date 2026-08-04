package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EyeblossomBlock.Type.class)
public class Type506825247Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/EyeblossomBlock$Type;", cancellable = true)
    private static void values_1467981085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467981085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/EyeblossomBlock$Type;", cancellable = true)
    private static void valueOf__1921672230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921672230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transform()Lnet/minecraft/world/level/block/EyeblossomBlock$Type;", cancellable = true)
    private void transform__683621204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-683621204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state__1788933619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788933619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void block__250439852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250439852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromBoolean(Z)Lnet/minecraft/world/level/block/EyeblossomBlock$Type;", cancellable = true)
    private static void fromBoolean__101234726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-101234726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emitSounds()Z", cancellable = true)
    private void emitSounds_545103830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545103830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longSwitchSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void longSwitchSound_1597038145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597038145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnTransformParticle(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void spawnTransformParticle__1972089553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1972089553L))
            info.cancel();
    }


}
