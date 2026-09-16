package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.Layer.class)
public class Layer695308638Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__213317630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213317630L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1465732163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465732163L))
            info.setReturnValue("3SyEG13r<GSU#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1252660729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252660729L))
            info.setReturnValue(717106336);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1491172834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1491172834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usePlayerTexture()Z", cancellable = true)
    private void usePlayerTexture__2090910142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090910142L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "leatherDyeable(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Layer;", cancellable = true)
    private static void leatherDyeable_38743565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38743565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dyeable()Ljava/util/Optional;", cancellable = true)
    private void dyeable_538781910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538781910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void textureId_1082821179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082821179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyIfDyed(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Layer;", cancellable = true)
    private static void onlyIfDyed__1716973711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716973711L))
            info.setReturnValue(null);
    }


}
