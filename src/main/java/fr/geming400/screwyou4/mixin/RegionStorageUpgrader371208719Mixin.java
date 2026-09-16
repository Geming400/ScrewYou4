package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.RegionStorageUpgrader.class)
public class RegionStorageUpgrader371208719Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)V", cancellable = true)
    private void init_1820029320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1820029320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "upgrade()V", cancellable = true)
    private void upgrade__1018720218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1018720218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fileAmount()I", cancellable = true)
    private void fileAmount_1207229313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207229313L))
            info.setReturnValue(-1932737572);
    }


}
