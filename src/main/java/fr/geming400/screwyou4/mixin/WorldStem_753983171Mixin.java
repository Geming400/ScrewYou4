package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldStem.class)
public class WorldStem_753983171Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__154643098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154643098L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1524406695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524406695L))
            info.setReturnValue("yt`2\uC2767\u89D5Ql}\u27ED3\u6D30KA-.y4.)N3+?uYn\u26E5i)vpc;z0\u38A6x[Eq)`v\uFEB5<\uA78C/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1311335261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311335261L))
            info.setReturnValue(1765283294);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1360592259(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1360592259L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "worldDataAndGenSettings()Lnet/minecraft/world/level/storage/LevelDataAndDimensions$WorldDataAndGenSettings;", cancellable = true)
    private void worldDataAndGenSettings_820903502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(820903502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceManager()Lnet/minecraft/server/packs/resources/CloseableResourceManager;", cancellable = true)
    private void resourceManager__1089575165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1089575165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void registries_934412438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934412438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataPackResources()Lnet/minecraft/server/ReloadableServerResources;", cancellable = true)
    private void dataPackResources_524216763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524216763L))
            info.setReturnValue(null);
    }


}
