package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.ContextEntityType.class)
public class ContextEntityType_2129508626Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void get__209860197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-209860197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get_41194419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(41194419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type__1004640267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004640267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1220882357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220882357L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1395035146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395035146L))
            info.setReturnValue("*pU\uC397]{Y*6r,qu/D.`g9r{,0b=ijG\u98B4(uZx9`5+:kL|\uD13Df1JC5hXgjq-r>1VbdqOKEM&S_4\uA66F<1\u96B9*/y@ImL9\u95ADj\"C@n|]C*q\uAF2ANt[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1608106580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608106580L))
            info.setReturnValue(826556750);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec__2131907588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131907588L))
            info.setReturnValue(null);
    }


}
