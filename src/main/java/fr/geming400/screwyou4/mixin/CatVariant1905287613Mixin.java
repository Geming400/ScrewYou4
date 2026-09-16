package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatVariant.class)
public class CatVariant1905287613Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_996661345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(996661345L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1619256158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619256158L))
            info.setReturnValue("\u7983%YwTD-I=(9x%3b\uB9E9tCaS\u4989=,,f,%qF\u49BBr5gF\u433Ei/\uBA96t!`Nxqx2Xu:8$94ohzI>Fi?L1X\uADA9\"KQK\u7A95JkHZj> o#)C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1832327592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1832327592L))
            info.setReturnValue(1309515743);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__523705612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-523705612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adultAssetInfo()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void adultAssetInfo_1558523389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558523389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyAssetInfo()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void babyAssetInfo_124543073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124543073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_1475614305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475614305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetInfo(Z)Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void assetInfo_1205309073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205309073L))
            info.setReturnValue(null);
    }


}
