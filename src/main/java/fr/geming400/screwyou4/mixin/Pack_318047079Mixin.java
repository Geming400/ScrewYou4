package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.Pack.class)
public class Pack_318047079Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__590579686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590579686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_875398673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875398673L))
            info.setReturnValue(1992724097);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/server/packs/PackLocationInfo;", cancellable = true)
    private void location__1349410292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349410292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId_1465338688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465338688L))
            info.setReturnValue("@x\u3C91\"5Upe8l\u2378jVLa2>\u919Fh\uBFBDit5;8T*?Yl\u14FA\u9E5E$\u405Ex\u10EDhF;PWO63S\u9C7C^\uBE69f\u793F\u04D3hv{dn;Au\u86F6X\"");
    }

    @Inject(at = @At("HEAD"), method = "open()Lnet/minecraft/server/packs/PackResources;", cancellable = true)
    private void open__973007009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973007009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__125896897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125896897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTitle_722723355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722723355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readMetaAndCreate(Lnet/minecraft/server/packs/PackLocationInfo;Lnet/minecraft/server/packs/repository/Pack$ResourcesSupplier;Lnet/minecraft/server/packs/PackType;Lnet/minecraft/server/packs/PackSelectionConfig;)Lnet/minecraft/server/packs/repository/Pack;", cancellable = true)
    private static void readMetaAndCreate_1588903796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588903796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChatLink(Z)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getChatLink__1912035257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912035257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readPackMetadata(Lnet/minecraft/server/packs/PackLocationInfo;Lnet/minecraft/server/packs/repository/Pack$ResourcesSupplier;Lnet/minecraft/server/packs/metadata/pack/PackFormat;Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/repository/Pack$Metadata;", cancellable = true)
    private static void readPackMetadata__1795914960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1795914960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRequestedFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void getRequestedFeatures__1730182269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730182269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRequired()Z", cancellable = true)
    private void isRequired__801067052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801067052L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCompatibility()Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private void getCompatibility__1171329135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171329135L))
            info.setReturnValue(net.minecraft.server.packs.repository.PackCompatibility.TOO_NEW);
    }

    @Inject(at = @At("HEAD"), method = "isFixedPosition()Z", cancellable = true)
    private void isFixedPosition_604399946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604399946L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultPosition()Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private void getDefaultPosition_1420550650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420550650L))
            info.setReturnValue(net.minecraft.server.packs.repository.Pack.Position.TOP);
    }

    @Inject(at = @At("HEAD"), method = "selectionConfig()Lnet/minecraft/server/packs/PackSelectionConfig;", cancellable = true)
    private void selectionConfig__468509478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468509478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackSource()Lnet/minecraft/server/packs/repository/PackSource;", cancellable = true)
    private void getPackSource__159872558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159872558L))
            info.setReturnValue(null);
    }


}
