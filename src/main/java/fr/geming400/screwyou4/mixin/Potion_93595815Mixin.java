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
            info.setReturnValue("9Df_gP\uA7C7\uFAD5yn\u614A<JvuD\uFEA1\u63700sE\u3DD4s\u1C06mh\u2F47|1Zp\u1669R\u69DC\u5866FW8M [PiWA\uC1E7&K2NLSW\u7D66\uBB6E'&GmW{a(=\u1FA0Au*0z\u2A5E\uC22B|l?HC9WJv#P%YGbR+]");
    }

    @Inject(at = @At("HEAD"), method = "hasInstantEffects()Z", cancellable = true)
    private void hasInstantEffects_131874397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(131874397L))
            info.setReturnValue(false);
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


}
