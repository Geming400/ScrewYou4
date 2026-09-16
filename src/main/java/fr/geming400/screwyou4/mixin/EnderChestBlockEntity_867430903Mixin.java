package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.EnderChestBlockEntity.class)
public class EnderChestBlockEntity_867430903Mixin {
        @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1166480268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1166480268L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent__524928821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-524928821L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOpenNess(F)F", cancellable = true)
    private void getOpenNess_289963654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289963654L))
            info.setReturnValue(1.202085E8F);
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_414502939(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(414502939L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen__185522053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-185522053L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lidAnimateTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/EnderChestBlockEntity;)V", cancellable = true)
    private static void lidAnimateTick__650226204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-650226204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recheckOpen()V", cancellable = true)
    private void recheckOpen__521712278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-521712278L))
            info.cancel();
    }


}
