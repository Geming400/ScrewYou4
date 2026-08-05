package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect.class)
public class ApplyStatusEffectsConsumeEffect1032151245Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1877303792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877303792L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__103308730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103308730L))
            info.setReturnValue("B{IHJY#㍟%1J2'%<-g]z<U5QSfr(軯g괻k/;6b'n6C!i)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1070413987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070413987L))
            info.setReturnValue(-1026537108);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void apply_1024838432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1024838432L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/consume_effects/ConsumeEffect$Type;", cancellable = true)
    private void getType_439413861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439413861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects__1636479235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636479235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "probability()F", cancellable = true)
    private void probability_1070410608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070410608L))
            info.setReturnValue(8.654003E8F);
    }


}
