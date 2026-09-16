package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.SelectItemModel.Unbaked.class)
public class Unbaked366009202Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1029241452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1029241452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__542617066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542617066L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1136432727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136432727L))
            info.setReturnValue("1\"lv0opq%i/I%wS1@;HyT\u311E:?xSE\uB410X3Q- =|<Hs7\uB335lH]\u2314mh! \u2C07|\u2D89\uD16EOv+&_Kzfo*R8\uFB8103BOY'\u4A24*z|n`}YN4$l\u4D4ECbcuezR ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_923361293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923361293L))
            info.setReturnValue(-1109421072);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Ljava/util/Optional;", cancellable = true)
    private void fallback__379326974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379326974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1564546345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1564546345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unbakedSwitch()Lnet/minecraft/client/renderer/item/SelectItemModel$UnbakedSwitch;", cancellable = true)
    private void unbakedSwitch_1578403818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578403818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1441699485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1441699485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1123363616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123363616L))
            info.setReturnValue(null);
    }


}
