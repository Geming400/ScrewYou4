package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.Potion.class)
public class Potion_93595815Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_902862970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902862970L))
            info.setReturnValue("aWcIz/[4mp\uFE23QkF=}#\uC9BEJ`M'wA\uADA8z{QoixkGvv|\u33C9 z\"5n|,To2");
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures__810022852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810022852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures([Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/item/alchemy/Potion;", cancellable = true)
    private void requiredFeatures_1899752420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899752420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEffects()Ljava/util/List;", cancellable = true)
    private void getEffects__1392284254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1392284254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasInstantEffects()Z", cancellable = true)
    private void hasInstantEffects_1614524962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1614524962L))
            info.setReturnValue(false);
    }


}
