package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.RegionStorageUpgrader.class)
public class RegionStorageUpgrader371208719Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)V", cancellable = true)
    private void init__1151676264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1151676264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fileAmount()I", cancellable = true)
    private void fileAmount_409470965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409470965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgrade()V", cancellable = true)
    private void upgrade_409483458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(409483458L))
            info.cancel();
    }


}
