package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect.class)
public class RemoveStatusEffectsConsumeEffect_179522853Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__729103416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-729103416L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_949946377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949946377L))
            info.setReturnValue("i}{=gav?1{0]_G\u23639[E!E:-7h=[\uD655pw\uAADDLUP|0S6]C2HHk&/#vK\uA6B0{!>^Cs\u80B0Y\uB9DF\u6711)S$@vw??");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_736874943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736874943L))
            info.setReturnValue(-808288983);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply__1611523767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611523767L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType__511879412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511879412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void effects__1840936134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840936134L))
            info.setReturnValue(null);
    }


}
