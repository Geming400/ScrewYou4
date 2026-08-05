package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect.class)
public class RemoveStatusEffectsConsumeEffect_179522853Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1565035111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565035111L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__955937123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-955937123L))
            info.setReturnValue("|=Ns19褟.K)jPPN%c[H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_217785594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217785594L))
            info.setReturnValue(1747922921);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply_172210039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172210039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType__413214532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413214532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void effects_1799475896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799475896L))
            info.setReturnValue(null);
    }


}
