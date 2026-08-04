package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.Pack.class)
public class Pack_318047079Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1703558841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703558841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_356309324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356309324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/server/packs/PackLocationInfo;", cancellable = true)
    private void location__2115965663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115965663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId__817413393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-817413393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "open()Lnet/minecraft/server/packs/PackResources;", cancellable = true)
    private void open__372219243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372219243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__1858862087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858862087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackSource()Lnet/minecraft/server/packs/repository/PackSource;", cancellable = true)
    private void getPackSource_1149050312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149050312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultPosition()Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private void getDefaultPosition_843489230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843489230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectionConfig()Lnet/minecraft/server/packs/PackSelectionConfig;", cancellable = true)
    private void selectionConfig_1266356204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266356204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTitle__1858862087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858862087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompatibility()Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private void getCompatibility_77575947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77575947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFixedPosition()Z", cancellable = true)
    private void isFixedPosition_356325661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356325661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRequired()Z", cancellable = true)
    private void isRequired_356325661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356325661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readMetaAndCreate(Lnet/minecraft/server/packs/PackLocationInfo;Lnet/minecraft/server/packs/repository/Pack$ResourcesSupplier;Lnet/minecraft/server/packs/PackType;Lnet/minecraft/server/packs/PackSelectionConfig;)Lnet/minecraft/server/packs/repository/Pack;", cancellable = true)
    private static void readMetaAndCreate__1167610820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167610820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readPackMetadata(Lnet/minecraft/server/packs/PackLocationInfo;Lnet/minecraft/server/packs/repository/Pack$ResourcesSupplier;Lnet/minecraft/server/packs/metadata/pack/PackFormat;Lnet/minecraft/server/packs/PackType;)Lnet/minecraft/server/packs/repository/Pack$Metadata;", cancellable = true)
    private static void readPackMetadata_598965906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598965906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRequestedFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void getRequestedFeatures_982867576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982867576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChatLink(Z)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getChatLink__718163409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-718163409L))
            info.setReturnValue(null);
    }


}
