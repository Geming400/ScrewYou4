package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemModel.BakingContext.class)
public class BakingContext1825450133Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_916823865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(916823865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1699093638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699093638L))
            info.setReturnValue("k-XE8[\u5AA8/\uAF99h+Yh.}r\u7B89#[Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1912165072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912165072L))
            info.setReturnValue(1376288159);
    }

    @Inject(at = @At("HEAD"), method = "blockModelBaker()Lnet/minecraft/client/resources/model/ModelBaker;", cancellable = true)
    private void blockModelBaker__1562906132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1562906132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingItemModel(Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/MissingItemModel;", cancellable = true)
    private void missingItemModel_1376362488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376362488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingItemModel()Lnet/minecraft/client/renderer/item/MissingItemModel;", cancellable = true)
    private void missingItemModel_511680217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511680217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextSwapper()Lnet/minecraft/util/RegistryContextSwapper;", cancellable = true)
    private void contextSwapper_1440012397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1440012397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void playerSkinRenderCache__59632167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59632167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprites()Lnet/minecraft/client/resources/model/sprite/SpriteGetter;", cancellable = true)
    private void sprites_1829062967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829062967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityModelSet()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void entityModelSet__371265562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371265562L))
            info.setReturnValue(null);
    }


}
