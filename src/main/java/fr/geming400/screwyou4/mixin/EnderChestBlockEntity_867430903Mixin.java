package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.EnderChestBlockEntity.class)
public class EnderChestBlockEntity_867430903Mixin {
        @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1808036392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1808036392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent__128444723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128444723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen_199282535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(199282535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_199282535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(199282535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recheckOpen()V", cancellable = true)
    private void recheckOpen_905705641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(905705641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lidAnimateTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/EnderChestBlockEntity;)V", cancellable = true)
    private static void lidAnimateTick_1069318747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1069318747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOpenNess(F)F", cancellable = true)
    private void getOpenNess_2078561935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078561935L))
            info.setReturnValue(null);
    }


}
