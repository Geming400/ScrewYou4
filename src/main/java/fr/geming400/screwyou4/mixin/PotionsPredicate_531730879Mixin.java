package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.PotionsPredicate.class)
public class PotionsPredicate_531730879Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1917243137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917243137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__603729097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603729097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_569993620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(569993620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType_1800049741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800049741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches_1917371601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917371601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/alchemy/PotionContents;)Z", cancellable = true)
    private void matches_1227925510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227925510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "potions(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/core/component/predicates/DataComponentPredicate;", cancellable = true)
    private static void potions__1849769658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849769658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "potions()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void potions__2143283374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2143283374L))
            info.setReturnValue(null);
    }


}
