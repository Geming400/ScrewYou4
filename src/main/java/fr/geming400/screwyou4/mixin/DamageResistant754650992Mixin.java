package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.DamageResistant.class)
public class DamageResistant754650992Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2140163251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140163251L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__380808983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380808983L))
            info.setReturnValue(">R-;,pEAFKknCF8*p@_FBrEO$1|2_7mcWk_xm' }퓜{${Bm'=Ḁ`c辅K{B\"{@Fur_B[Q)vCu≀vY枮vKi奼kB#:죙#5Bp6ᔥa:Iexu|sm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_792913734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792913734L))
            info.setReturnValue(1096691155);
    }

    @Inject(at = @At("HEAD"), method = "types()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void types__1920363260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920363260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isResistantTo(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isResistantTo_422981376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422981376L))
            info.setReturnValue(false);
    }


}
