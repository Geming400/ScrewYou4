package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.SelectItemModelProperty.Type.class)
public class Type2082847561Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__826607476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826607476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_947387586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947387586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2121110303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121110303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/serialization/MapCodec;Lcom/mojang/serialization/Codec;)Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private static void create_410550485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410550485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "switchCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void switchCodec__476266011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476266011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCasesFieldCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void createCasesFieldCodec__1816492444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816492444L))
            info.setReturnValue(null);
    }


}
