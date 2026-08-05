package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsUsingItem.class)
public class IsUsingItem161273807Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_292396383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292396383L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1233976847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233976847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__747352461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747352461L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_931697332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931697332L))
            info.setReturnValue("8j(8X*UJ3B0Ki)|U%M-_B'r]FpV\u93CE<C2n}ty\u798Dld8F:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_718625898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718625898L))
            info.setReturnValue(1575461974);
    }


}
