package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemModel.BakingContext.class)
public class BakingContext1825450133Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1084004904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084004904L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_689990158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689990158L))
            info.setReturnValue("\uC14FQr]`\u57F1\u2540DLmwsI)27Brh\u4D86?.A\uB398sCwor");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1863712875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1863712875L))
            info.setReturnValue(1975400285);
    }

    @Inject(at = @At("HEAD"), method = "blockModelBaker()Lnet/minecraft/client/resources/model/ModelBaker;", cancellable = true)
    private void blockModelBaker_1326943817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326943817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextSwapper()Lnet/minecraft/util/RegistryContextSwapper;", cancellable = true)
    private void contextSwapper_623936456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623936456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingItemModel()Lnet/minecraft/client/renderer/item/MissingItemModel;", cancellable = true)
    private void missingItemModel__803675671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803675671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingItemModel(Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/MissingItemModel;", cancellable = true)
    private void missingItemModel_250788616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250788616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprites()Lnet/minecraft/client/resources/model/sprite/SpriteGetter;", cancellable = true)
    private void sprites__1424349335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424349335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityModelSet()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void entityModelSet_41006186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(41006186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void playerSkinRenderCache__1434834233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434834233L))
            info.setReturnValue(null);
    }


}
