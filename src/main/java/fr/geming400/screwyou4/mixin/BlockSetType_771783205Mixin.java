package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BlockSetType.class)
public class BlockSetType_771783205Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__363677267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363677267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2137671833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137671833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__363676771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363676771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/stream/Stream;", cancellable = true)
    private static void values_561077137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561077137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_810045946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810045946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundType()Lnet/minecraft/world/level/block/SoundType;", cancellable = true)
    private void soundType_489608445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489608445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlateClickOff()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void pressurePlateClickOff_1861996102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861996102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlateClickOn()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void pressurePlateClickOn_1861996102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861996102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonClickOn()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void buttonClickOn_1861996102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861996102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonClickOff()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void buttonClickOff_1861996102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861996102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canOpenByWindCharge()Z", cancellable = true)
    private void canOpenByWindCharge_810061787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810061787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canOpenByHand()Z", cancellable = true)
    private void canOpenByHand_810061787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810061787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canButtonBeActivatedByArrows()Z", cancellable = true)
    private void canButtonBeActivatedByArrows_810061787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810061787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doorClose()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void doorClose_1861996102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861996102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doorOpen()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void doorOpen_1861996102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861996102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlateSensitivity()Lnet/minecraft/world/level/block/state/properties/BlockSetType$PressurePlateSensitivity;", cancellable = true)
    private void pressurePlateSensitivity__64223025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64223025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trapdoorClose()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void trapdoorClose_1861996102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861996102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trapdoorOpen()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void trapdoorOpen_1861996102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861996102L))
            info.setReturnValue(null);
    }


}
