package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.HasComponent.class)
public class HasComponent504912233Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__1776003549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776003549L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__2054201339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054201339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1890424492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890424492L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__630547742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630547742L))
            info.setReturnValue("sSzC\u7EA0 b9g\"<`\u03F8.yOR|l=Y[Q-D!d\uD37FJUE$R%hPOGC8OWJI\uBC62bB-(8Om/N<\u82A1j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_543174975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543174975L))
            info.setReturnValue(2110888475);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType_1773231096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773231096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreDefault()Z", cancellable = true)
    private void ignoreDefault_543190816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543190816L))
            info.setReturnValue(true);
    }


}
