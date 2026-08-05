package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BarrelBlockEntity.class)
public class BarrelBlockEntity_807924836Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_846187081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846187081L))
            info.setReturnValue(836731850);
    }

    @Inject(at = @At("HEAD"), method = "getEntitiesWithContainerOpen()Ljava/util/List;", cancellable = true)
    private void getEntitiesWithContainerOpen__1860705645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860705645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen_139776468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(139776468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_139776468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(139776468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recheckOpen()V", cancellable = true)
    private void recheckOpen_846199574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(846199574L))
            info.cancel();
    }


}
