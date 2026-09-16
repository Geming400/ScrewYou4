package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.ClearAllStatusEffectsConsumeEffect.class)
public class ClearAllStatusEffectsConsumeEffect70446955Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__838179313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838179313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_840870480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840870480L))
            info.setReturnValue("Sm6wH\u096C\uD5AECM_D?FWgZ/\uB184{7\"Y:`z%CWIECz!h?c\u85CAwn=\u3189\"LU\"\uC786h6|_L?u1\uCB3Erd1Z\u783D\u649B4oBv%e{!|JnE]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_627799046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627799046L))
            info.setReturnValue(-1184994471);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply__1720599664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720599664L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType__620955309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620955309L))
            info.setReturnValue(null);
    }


}
