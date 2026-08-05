package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.ContextDimension.class)
public class ContextDimension_300550903Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void get__47282774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47282774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__635852882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635852882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1504115284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504115284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1686063161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686063161L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__834909073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834909073L))
            info.setReturnValue("RP&r8')@O\u1098R'j\uCAC3XF'-p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_338813644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338813644L))
            info.setReturnValue(-55390301);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec__91414724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91414724L))
            info.setReturnValue(null);
    }


}
