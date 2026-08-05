package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.BundleSelectedItemSpecialRenderer.Unbaked.class)
public class Unbaked_653178492Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1905935081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905935081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2038690750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038690750L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__482281484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482281484L))
            info.setReturnValue("6\"ᆀKD拳!졇5{kPcz`h<6ᯀx9bX@*Ug\"JVboℊmfʖQ;煛z,T*I5s?'yZA9_}r!diP%u蘅S[P ne}z夕1p;卺n⾗@/\"%{굝|D딚>yO*IiKS/A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_691441233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691441233L))
            info.setReturnValue(-2092544340);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_603384561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(603384561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_2086773392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086773392L))
            info.setReturnValue(null);
    }


}
