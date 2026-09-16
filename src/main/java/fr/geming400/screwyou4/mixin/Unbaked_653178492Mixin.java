package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.BundleSelectedItemSpecialRenderer.Unbaked.class)
public class Unbaked_653178492Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__742072163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742072163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__255447777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-255447777L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1423602016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423602016L))
            info.setReturnValue("krX|{ah/f j(k\uBC0F,YANwe=#CmD|\u6FFDT=r<?:C)@[U9Ckaez\u351BSLzfB<aq$Uo@\uD2E3%\u199EIOU#Po\u4CBE\"+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1210530582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1210530582L))
            info.setReturnValue(895246417);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/item/ItemModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/ItemModel;", cancellable = true)
    private void bake_1410532905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410532905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1728868774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1728868774L))
            info.cancel();
    }


}
