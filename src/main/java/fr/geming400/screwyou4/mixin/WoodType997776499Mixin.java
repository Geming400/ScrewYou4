package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.WoodType.class)
public class WoodType997776499Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__137683972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137683972L))
            info.setReturnValue("\u4848ID.Y)DHp");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1911678538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1911678538L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__137683476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137683476L))
            info.setReturnValue("bs QCr2em[ix-Yu1.%`M?m\u824EXH\uFB81B\uCE7FQ[pv6BRG>T\uD3C4[;&iA3Z'Q2\uBD33qY)wE/D\u0CB6(d/o3Mj#d2hz_eXgc{33y S\uA768ojS6&^J?f$[ZG");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/stream/Stream;", cancellable = true)
    private static void values_787070432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787070432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1036039241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036039241L))
            info.setReturnValue(-631194641);
    }

    @Inject(at = @At("HEAD"), method = "setType()Lnet/minecraft/world/level/block/state/properties/BlockSetType;", cancellable = true)
    private void setType_577137064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(577137064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundType()Lnet/minecraft/world/level/block/SoundType;", cancellable = true)
    private void soundType_715601740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(715601740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingSignSoundType()Lnet/minecraft/world/level/block/SoundType;", cancellable = true)
    private void hangingSignSoundType_715601740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(715601740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fenceGateOpen()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void fenceGateOpen_2087989397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087989397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fenceGateClose()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void fenceGateClose_2087989397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087989397L))
            info.setReturnValue(null);
    }


}
