package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.RegionStorageUpgrader.Builder.class)
public class Builder_588112082Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void copy_1862976568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862976568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(I)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader;", cancellable = true)
    private void build__1249637226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249637226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setType(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setType_746128494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746128494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTypeAndFolderName(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setTypeAndFolderName_746128494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746128494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDataFixType(Lnet/minecraft/util/datafix/DataFixTypes;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setDataFixType__357909396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357909396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTagModifier(ILnet/minecraft/util/worldupdate/RegionStorageUpgrader$TagModifier;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void addTagModifier__1122142419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122142419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDefaultVersion(I)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setDefaultVersion_1969661535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969661535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFolderName(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setFolderName_746128494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746128494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackProgress(Lnet/minecraft/util/worldupdate/UpgradeProgress;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void trackProgress__1754007291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754007291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRecreateRegionFiles(Z)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setRecreateRegionFiles__2104577938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104577938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDataFixContextTag(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setDataFixContextTag__1300599027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300599027L))
            info.setReturnValue(null);
    }


}
