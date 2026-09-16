package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.RegionStorageUpgrader.Builder.class)
public class Builder_588112082Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void copy_1589592685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589592685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(I)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader;", cancellable = true)
    private void build_938862952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938862952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setType(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setType_1705979178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705979178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRecreateRegionFiles(Z)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setRecreateRegionFiles__1597783172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597783172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDataFixContextTag(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setDataFixContextTag_2081155065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081155065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTypeAndFolderName(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setTypeAndFolderName_1228242530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228242530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFolderName(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setFolderName__974734583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974734583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTagModifier(ILnet/minecraft/util/worldupdate/RegionStorageUpgrader$TagModifier;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void addTagModifier__968550403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968550403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDataFixType(Lnet/minecraft/util/datafix/DataFixTypes;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setDataFixType__1357287319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357287319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDefaultVersion(I)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void setDefaultVersion__491738266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491738266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackProgress(Lnet/minecraft/util/worldupdate/UpgradeProgress;)Lnet/minecraft/util/worldupdate/RegionStorageUpgrader$Builder;", cancellable = true)
    private void trackProgress__1065320547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065320547L))
            info.setReturnValue(null);
    }


}
