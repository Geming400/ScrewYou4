package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EyeblossomBlock.Type.class)
public class Type506825247Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/EyeblossomBlock$Type;", cancellable = true)
    private static void values__709565765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709565765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/EyeblossomBlock$Type;", cancellable = true)
    private static void valueOf_1912791810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912791810L))
            info.setReturnValue(net.minecraft.world.level.block.EyeblossomBlock.Type.OPEN);
    }

    @Inject(at = @At("HEAD"), method = "transform()Lnet/minecraft/world/level/block/EyeblossomBlock$Type;", cancellable = true)
    private void transform__1782197992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782197992L))
            info.setReturnValue(net.minecraft.world.level.block.EyeblossomBlock.Type.CLOSED);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state_175314910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175314910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void block_1342069927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342069927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromBoolean(Z)Lnet/minecraft/world/level/block/EyeblossomBlock$Type;", cancellable = true)
    private static void fromBoolean__629562372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629562372L))
            info.setReturnValue(net.minecraft.world.level.block.EyeblossomBlock.Type.CLOSED);
    }

    @Inject(at = @At("HEAD"), method = "longSwitchSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void longSwitchSound_958715778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958715778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnTransformParticle(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void spawnTransformParticle__972177160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972177160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitSounds()Z", cancellable = true)
    private void emitSounds_367818559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367818559L))
            info.setReturnValue(true);
    }


}
