package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.ClearAllStatusEffectsConsumeEffect.class)
public class ClearAllStatusEffectsConsumeEffect70446955Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1455959214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455959214L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1065013020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065013020L))
            info.setReturnValue("Thg\u7889P\u078B{>7NKtm\u273F}\u1BCF\u87D2Zj58\u5A33-+h%G[{P&%\uA2E7\uCAE9[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_108709697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108709697L))
            info.setReturnValue(-532902367);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply_63134142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63134142L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType__522290429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522290429L))
            info.setReturnValue(null);
    }


}
