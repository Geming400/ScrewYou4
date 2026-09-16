package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.ProfilePublicKey.class)
public class ProfilePublicKey296644943Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__611981325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611981325L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1067068468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067068468L))
            info.setReturnValue("|[|ON<B-39>8zcAU2`fTX1\u49E1\u4763:W0{w3m.<&ZHQk\uFA4E\u56B0LKNXw%\u017EUoc]>w\u103A\uD413O2<PH\uA08A1(\u6DDE2E\uAFD9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_853997034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(853997034L))
            info.setReturnValue(529136329);
    }

    @Inject(at = @At("HEAD"), method = "data()Lnet/minecraft/world/entity/player/ProfilePublicKey$Data;", cancellable = true)
    private void data__302878277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302878277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSignatureValidator()Lnet/minecraft/util/SignatureValidator;", cancellable = true)
    private void createSignatureValidator_199374602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199374602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createValidated(Lnet/minecraft/util/SignatureValidator;Ljava/util/UUID;Lnet/minecraft/world/entity/player/ProfilePublicKey$Data;)Lnet/minecraft/world/entity/player/ProfilePublicKey;", cancellable = true)
    private static void createValidated__670134986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670134986L))
            info.setReturnValue(null);
    }


}
