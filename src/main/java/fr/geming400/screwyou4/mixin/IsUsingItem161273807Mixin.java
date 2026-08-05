package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsUsingItem.class)
public class IsUsingItem161273807Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__2119641975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119641975L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1897127531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897127531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1546786066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546786066L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__974186168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974186168L))
            info.setReturnValue("T際z닝D稕0H/W?np");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_199536549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199536549L))
            info.setReturnValue(1711666661);
    }


}
