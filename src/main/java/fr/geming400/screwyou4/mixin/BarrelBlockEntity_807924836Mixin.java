package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BarrelBlockEntity.class)
public class BarrelBlockEntity_807924836Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__1247839907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247839907L))
            info.setReturnValue(1859867915);
    }

    @Inject(at = @At("HEAD"), method = "getEntitiesWithContainerOpen()Ljava/util/List;", cancellable = true)
    private void getEntitiesWithContainerOpen_1977912929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977912929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_354996872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(354996872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen__245028120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-245028120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recheckOpen()V", cancellable = true)
    private void recheckOpen__581218345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-581218345L))
            info.cancel();
    }


}
