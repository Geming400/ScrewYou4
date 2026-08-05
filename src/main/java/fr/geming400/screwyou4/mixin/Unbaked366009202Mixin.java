package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.SelectItemModel.Unbaked.class)
public class Unbaked366009202Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_2101862926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101862926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1751521461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751521461L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__769450773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769450773L))
            info.setReturnValue("蠩ᗝ3zFT⢯X쮅x2:k>Jt릊D?GﮤJw*!JdkSj9On]㎔SN}ᙳg@e7Hs8BiລU?F%u,^/eR4I䈅X`ZcJ郓[}*jh]lIqᚮd>u?*KꑄG9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_404271944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404271944L))
            info.setReturnValue(890048511);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Ljava/util/Optional;", cancellable = true)
    private void fallback_611470624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611470624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_611470624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611470624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1799604103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799604103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_316215272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(316215272L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unbakedSwitch()Lnet/minecraft/client/renderer/item/SelectItemModel$UnbakedSwitch;", cancellable = true)
    private void unbakedSwitch_1685290980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685290980L))
            info.setReturnValue(null);
    }


}
