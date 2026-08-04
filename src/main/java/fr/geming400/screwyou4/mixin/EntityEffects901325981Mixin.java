package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.AllOf.EntityEffects.class)
public class EntityEffects901325981Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2008129056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008129056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__234133994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-234133994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_939588723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939588723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_2142077752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2142077752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects__1767304499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767304499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1657787591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657787591L))
            info.setReturnValue(null);
    }


}
