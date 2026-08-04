package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.BundleHasSelectedItem.class)
public class BundleHasSelectedItem94886792Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_2108938306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108938306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1830740516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1830740516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1480399051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480399051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1040573183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040573183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_133149534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133149534L))
            info.setReturnValue(null);
    }


}
