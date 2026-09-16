package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.TeleportRandomlyConsumeEffect.class)
public class TeleportRandomlyConsumeEffect_1166983500Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_258357231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258357231L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1937407024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937407024L))
            info.setReturnValue("a4rgFidv'F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1724335590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724335590L))
            info.setReturnValue(166332415);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply__624063120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624063120L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType_475581235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475581235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "diameter()F", cancellable = true)
    private void diameter_993314689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993314689L))
            info.setReturnValue(3.061254E8F);
    }


}
