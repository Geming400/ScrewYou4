package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.CombatEntry.class)
public class CombatEntry_874871232Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2034583806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2034583806L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__260588744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-260588744L))
            info.setReturnValue("m{A`蕿P)_#ᕠP<vtqbl5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_913133973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913133973L))
            info.setReturnValue(-126605044);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void source__1841660731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841660731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallLocation()Lnet/minecraft/world/damagesource/FallLocation;", cancellable = true)
    private void fallLocation__718157025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-718157025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallDistance()F", cancellable = true)
    private void fallDistance_913130594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913130594L))
            info.setReturnValue(9.744522E8F);
    }

    @Inject(at = @At("HEAD"), method = "damage()F", cancellable = true)
    private void damage_913130594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913130594L))
            info.setReturnValue(9.744522E8F);
    }


}
