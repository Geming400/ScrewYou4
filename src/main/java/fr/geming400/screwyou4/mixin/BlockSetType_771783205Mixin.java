package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BlockSetType.class)
public class BlockSetType_771783205Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1581050360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581050360L))
            info.setReturnValue("88D}r!MDo?4\u1F4C$1j:\u66E81\uBD17G*-d!$%^]gN\"d<]VL");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__136843064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-136843064L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1542206729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542206729L))
            info.setReturnValue("fM");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/stream/Stream;", cancellable = true)
    private static void values__1797543505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797543505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1329135295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329135295L))
            info.setReturnValue(-71177729);
    }

    @Inject(at = @At("HEAD"), method = "soundType()Lnet/minecraft/world/level/block/SoundType;", cancellable = true)
    private void soundType_377945332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377945332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canButtonBeActivatedByArrows()Z", cancellable = true)
    private void canButtonBeActivatedByArrows__107937074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107937074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doorClose()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void doorClose_1125765532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125765532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doorOpen()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void doorOpen__1373526482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1373526482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canOpenByWindCharge()Z", cancellable = true)
    private void canOpenByWindCharge_333757454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333757454L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canOpenByHand()Z", cancellable = true)
    private void canOpenByHand__195956837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195956837L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlateSensitivity()Lnet/minecraft/world/level/block/state/properties/BlockSetType$PressurePlateSensitivity;", cancellable = true)
    private void pressurePlateSensitivity__1866888739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866888739L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.BlockSetType.PressurePlateSensitivity.EVERYTHING);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlateClickOn()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void pressurePlateClickOn_2003373968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003373968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trapdoorOpen()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void trapdoorOpen__598869983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598869983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonClickOff()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void buttonClickOff_1988902349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988902349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonClickOn()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void buttonClickOn_1797419377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797419377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pressurePlateClickOff()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void pressurePlateClickOff__216439922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216439922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trapdoorClose()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void trapdoorClose__629686775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629686775L))
            info.setReturnValue(null);
    }


}
