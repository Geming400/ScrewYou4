package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.ComponentContents.class)
public class ComponentContents1968875161Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get_1032342417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032342417L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type__1122527753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122527753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__940579876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940579876L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_833415186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833415186L))
            info.setReturnValue("7u-c⇭$⼺+XBN2]&Ɬv`Nh}L#VS@#&9XS6i^DxI*-㱣vCcṱ*Sw-VjO_-AW*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2007137903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007137903L))
            info.setReturnValue(2024716772);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1057773272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057773272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_1576909535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576909535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "castType()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private static void castType__1122527505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122527505L))
            info.setReturnValue(null);
    }


}
