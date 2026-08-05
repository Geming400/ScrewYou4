package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.Layer.class)
public class Layer695308638Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2080820897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080820897L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__440151337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-440151337L))
            info.setReturnValue(" ึ^D75Vj/9z96dh]lgT㒧J2yghF28]KT?'i");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_733571380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733571380L))
            info.setReturnValue(-1805122513);
    }

    @Inject(at = @At("HEAD"), method = "dyeable()Ljava/util/Optional;", cancellable = true)
    private void dyeable_940770060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940770060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void textureId__1747757915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747757915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1461051036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1461051036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usePlayerTexture()Z", cancellable = true)
    private void usePlayerTexture_733587221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733587221L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "leatherDyeable(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Layer;", cancellable = true)
    private static void leatherDyeable_1925620814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925620814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyIfDyed(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Layer;", cancellable = true)
    private static void onlyIfDyed_1925620814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925620814L))
            info.setReturnValue(null);
    }


}
