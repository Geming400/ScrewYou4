package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.Charge.class)
public class Charge_728928762Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/world/item/CrossbowItem$ChargeType;", cancellable = true)
    private void get_885311268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(885311268L))
            info.setReturnValue(net.minecraft.world.item.CrossbowItem.ChargeType.ARROW);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__1359385445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359385445L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1889747165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889747165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__179697507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179697507L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1499352286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499352286L))
            info.setReturnValue("(hV:qAX`%p\u1A90gCJf\u465C#U9F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1286280852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286280852L))
            info.setReturnValue(797123733);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_762479844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762479844L))
            info.setReturnValue(null);
    }


}
