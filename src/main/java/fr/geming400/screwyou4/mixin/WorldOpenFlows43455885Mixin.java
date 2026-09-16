package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldOpenFlows.class)
public class WorldOpenFlows43455885Mixin {
        @Inject(at = @At("HEAD"), method = "openWorld(Ljava/lang/String;Ljava/lang/Runnable;)V", cancellable = true)
    private void openWorld_871952736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871952736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFreshLevel(Ljava/lang/String;Lnet/minecraft/world/level/LevelSettings;Lnet/minecraft/world/level/levelgen/WorldOptions;Ljava/util/function/Function;Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void createFreshLevel_868753991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(868753991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLevelFromExistingSettings(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lnet/minecraft/server/ReloadableServerResources;Lnet/minecraft/core/LayeredRegistryAccess;Lnet/minecraft/world/level/storage/LevelDataAndDimensions$WorldDataAndGenSettings;Ljava/util/Optional;)V", cancellable = true)
    private void createLevelFromExistingSettings_1533432752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1533432752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmWorldCreation(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/screens/worldselection/CreateWorldScreen;Lcom/mojang/serialization/Lifecycle;Ljava/lang/Runnable;Z)V", cancellable = true)
    private static void confirmWorldCreation_934140756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(934140756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadWorldStem(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lcom/mojang/serialization/Dynamic;ZLnet/minecraft/server/packs/repository/PackRepository;)Lnet/minecraft/server/WorldStem;", cancellable = true)
    private void loadWorldStem__788665689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788665689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreateWorldData(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void recreateWorldData__1411120522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411120522L))
            info.setReturnValue(null);
    }


}
