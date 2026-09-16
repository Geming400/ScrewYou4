package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.ContextDimension.class)
public class ContextDimension_300550903Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void get__2038817920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038817920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__1787763304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787763304L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1461369306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461369306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__608075366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608075366L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1070974427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070974427L))
            info.setReturnValue("O\u5AA2u<.\uB2BAi9#\u720DqK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_857902993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857902993L))
            info.setReturnValue(-1333527757);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_334101985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334101985L))
            info.setReturnValue(null);
    }


}
