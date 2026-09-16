package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.ComponentMatches.class)
public class ComponentMatches_699925092Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_831047667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831047667L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__695325563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695325563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__208701177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-208701177L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1470348616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470348616L))
            info.setReturnValue("\u97593UZk\u40BC9\uA725./K\u4A7Bf7{\u95E15D;jK\u45E3t\uA437?8G\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1257277182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1257277182L))
            info.setReturnValue(1001298665);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/predicates/DataComponentPredicate$Single;", cancellable = true)
    private void predicate_1448036269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448036269L))
            info.setReturnValue(null);
    }


}
