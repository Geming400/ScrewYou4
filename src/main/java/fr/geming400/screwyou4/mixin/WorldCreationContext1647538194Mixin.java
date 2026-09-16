package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldCreationContext.class)
public class WorldCreationContext1647538194Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_738911926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738911926L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1877005577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877005577L))
            info.setReturnValue("\uC3E3\uACBFtt\u7E7EP9wkwz^|]8se+e;*z--\u5FBB/T>1&i\u0677BFNsPwbi|\u2206\u0706J76n||w>\"fqe\u6666a#\"Kxx\u9F23\"tqRHPII<j\uAC000zLx\u254B)T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2090077011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090077011L))
            info.setReturnValue(-1352180333);
    }

    @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private void validate_763665263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(763665263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "options()Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void options_415622117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415622117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptions(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext$OptionsModifier;)Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;", cancellable = true)
    private void withOptions__1414997990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1414997990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldgenLoadContext()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void worldgenLoadContext__1232910172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1232910172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectedDimensions()Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void selectedDimensions_438554384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438554384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void dataConfiguration_637952566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(637952566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initialWorldCreationOptions()Lnet/minecraft/client/gui/screens/worldselection/InitialWorldCreationOptions;", cancellable = true)
    private void initialWorldCreationOptions__733526755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-733526755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "datapackDimensions()Lnet/minecraft/core/Registry;", cancellable = true)
    private void datapackDimensions_958385453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958385453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataPackResources()Lnet/minecraft/server/ReloadableServerResources;", cancellable = true)
    private void dataPackResources_1417771787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1417771787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldgenRegistries()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void worldgenRegistries_531732100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531732100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSettings(Lnet/minecraft/world/level/levelgen/WorldOptions;Lnet/minecraft/world/level/levelgen/WorldDimensions;)Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;", cancellable = true)
    private void withSettings__682267531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682267531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDimensions(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext$DimensionsUpdater;)Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;", cancellable = true)
    private void withDimensions_1466817468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466817468L))
            info.setReturnValue(null);
    }


}
