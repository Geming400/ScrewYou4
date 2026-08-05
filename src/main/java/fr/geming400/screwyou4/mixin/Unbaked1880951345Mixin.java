package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.CuboidItemModelWrapper.Unbaked.class)
public class Unbaked1880951345Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__678162227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678162227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1028503692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028503692L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_745491370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745491370L))
            info.setReturnValue("\uBEF2*!gG\uFEBE=,/9Skt2P/0\u57C6{Tk\u9C58.mI#apL]3_?Xj`<M+[aMXsZG\u7037As5rO=\u0246)T|cck\u4405*8X;\u5648umHbdvt\uD0A8e(>A8B\u408Bdf?jTg/1z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1919214087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919214087L))
            info.setReturnValue(1397913857);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void model__562115208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562115208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_2126412767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126412767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tints()Ljava/util/List;", cancellable = true)
    private void tints__787679135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-787679135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1831157415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1831157415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake__980421050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980421050L))
            info.setReturnValue(null);
    }


}
