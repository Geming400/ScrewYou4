package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.RangeSelectItemModel.Unbaked.class)
public class Unbaked398644375Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__996606279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-996606279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__509981893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-509981893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1169067900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169067900L))
            info.setReturnValue("xTcK>TON\u3CBB\uCFC3`,WH-\u7D33%i-u({(X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_955996466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955996466L))
            info.setReturnValue(-721939297);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__2025073616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025073616L))
            info.setReturnValue(3.192896E8F);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_695557975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695557975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;", cancellable = true)
    private void property_12631050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(12631050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Ljava/util/Optional;", cancellable = true)
    private void fallback__346691801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346691801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1597181518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597181518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1474334658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1474334658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1155998789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155998789L))
            info.setReturnValue(null);
    }


}
