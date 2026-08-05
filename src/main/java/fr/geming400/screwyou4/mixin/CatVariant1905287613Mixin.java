package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatVariant.class)
public class CatVariant1905287613Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1004167424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004167424L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_769827638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769827638L))
            info.setReturnValue("|7a*k$Q쯓)nCp稪(5Gv%=hulIkphlsL48mD[q2鄥OJ{F&a`!vSbj/c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1943550355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943550355L))
            info.setReturnValue(328556313);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions_998625767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998625767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adultAssetInfo()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void adultAssetInfo_653106393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653106393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyAssetInfo()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void babyAssetInfo_653106393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653106393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetInfo(Z)Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void assetInfo_744980367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744980367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors__763342867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763342867L))
            info.setReturnValue(null);
    }


}
