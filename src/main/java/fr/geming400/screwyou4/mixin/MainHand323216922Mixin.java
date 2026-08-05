package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.MainHand.class)
public class MainHand323216922Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private void get__408065695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-408065695L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__613186862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613186862L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1526781304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1526781304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1708729181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1708729181L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__812243053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812243053L))
            info.setReturnValue("ab\uD44C2G{^dWO87DFG4M]\u451Cd*x`\uAD05Zu11 g%\uAAA5N9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_361479664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361479664L))
            info.setReturnValue(1312779901);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec__68748704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68748704L))
            info.setReturnValue(null);
    }


}
