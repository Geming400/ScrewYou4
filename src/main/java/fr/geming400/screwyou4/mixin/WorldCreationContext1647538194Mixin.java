package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldCreationContext.class)
public class WorldCreationContext1647538194Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1261916843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261916843L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_512078219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512078219L))
            info.setReturnValue("B餚-IVsYS!rKg*1-Dmft,4/T=y43[xn:OⶆRṷ읦H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1685800936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685800936L))
            info.setReturnValue(-198338715);
    }

    @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private void validate_1685812933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1685812933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "options()Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void options__447970365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447970365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptions(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext$OptionsModifier;)Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;", cancellable = true)
    private void withOptions__2060446430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060446430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initialWorldCreationOptions()Lnet/minecraft/client/gui/screens/worldselection/InitialWorldCreationOptions;", cancellable = true)
    private void initialWorldCreationOptions_1701790510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701790510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldgenRegistries()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void worldgenRegistries__214482037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214482037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "datapackDimensions()Lnet/minecraft/core/Registry;", cancellable = true)
    private void datapackDimensions_1133682717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133682717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataPackResources()Lnet/minecraft/server/ReloadableServerResources;", cancellable = true)
    private void dataPackResources_2143816585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2143816585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSettings(Lnet/minecraft/world/level/levelgen/WorldOptions;Lnet/minecraft/world/level/levelgen/WorldDimensions;)Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;", cancellable = true)
    private void withSettings_1897674398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897674398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDimensions(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext$DimensionsUpdater;)Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;", cancellable = true)
    private void withDimensions_796592969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796592969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldgenLoadContext()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void worldgenLoadContext_1398787929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398787929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectedDimensions()Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void selectedDimensions__1732706744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732706744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void dataConfiguration__1730203190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730203190L))
            info.setReturnValue(null);
    }


}
