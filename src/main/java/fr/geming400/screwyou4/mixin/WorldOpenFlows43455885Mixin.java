package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldOpenFlows.class)
public class WorldOpenFlows43455885Mixin {
        @Inject(at = @At("HEAD"), method = "openWorld(Ljava/lang/String;Ljava/lang/Runnable;)V", cancellable = true)
    private void openWorld_367420872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(367420872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLevelFromExistingSettings(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lnet/minecraft/server/ReloadableServerResources;Lnet/minecraft/core/LayeredRegistryAccess;Lnet/minecraft/world/level/storage/LevelDataAndDimensions$WorldDataAndGenSettings;Ljava/util/Optional;)V", cancellable = true)
    private void createLevelFromExistingSettings_456298768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(456298768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmWorldCreation(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/screens/worldselection/CreateWorldScreen;Lcom/mojang/serialization/Lifecycle;Ljava/lang/Runnable;Z)V", cancellable = true)
    private static void confirmWorldCreation_2091781861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2091781861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadWorldStem(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lcom/mojang/serialization/Dynamic;ZLnet/minecraft/server/packs/repository/PackRepository;)Lnet/minecraft/server/WorldStem;", cancellable = true)
    private void loadWorldStem_228221746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228221746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreateWorldData(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void recreateWorldData_441256713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441256713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFreshLevel(Ljava/lang/String;Lnet/minecraft/world/level/LevelSettings;Lnet/minecraft/world/level/levelgen/WorldOptions;Ljava/util/function/Function;Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void createFreshLevel__275759207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-275759207L))
            info.cancel();
    }


}
