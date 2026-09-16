package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.AllOf.EntityEffects.class)
public class EntityEffects901325981Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__7300287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7300287L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1671749506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671749506L))
            info.setReturnValue("d,qWNuKN7h[?|Lg");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1458678072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458678072L))
            info.setReturnValue(-2068728503);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_576131978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(576131978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects_1452603087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452603087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1967771235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967771235L))
            info.setReturnValue(null);
    }


}
