package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.Potion.class)
public class Potion_93595815Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1041864657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041864657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures_758416312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(758416312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/item/alchemy/Potion;", cancellable = true)
    private void requiredFeatures__1250181912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250181912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEffects()Ljava/util/List;", cancellable = true)
    private void getEffects_1719932630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719932630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasInstantEffects()Z", cancellable = true)
    private void hasInstantEffects_131874397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(131874397L))
            info.setReturnValue(null);
    }


}
