package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.border.WorldBorder.Settings.class)
public class Settings_1922219705Mixin {
        @Inject(at = @At("HEAD"), method = "size()D", cancellable = true)
    private void size__1929020808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929020808L))
            info.setReturnValue(4.9268190088318956E8D);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1013593436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013593436L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1602324067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602324067L))
            info.setReturnValue("pZWDr&,p@Ct\u2CFEbcl|XcK.'\u8D72UCs4`rjAPGB]`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1815395501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815395501L))
            info.setReturnValue(-1202697173);
    }

    @Inject(at = @At("HEAD"), method = "lerpTime()J", cancellable = true)
    private void lerpTime__1084149253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084149253L))
            info.setReturnValue(1649948437596482739L);
    }

    @Inject(at = @At("HEAD"), method = "damagePerBlock()D", cancellable = true)
    private void damagePerBlock__117437638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-117437638L))
            info.setReturnValue(4.926819006418626E8D);
    }

    @Inject(at = @At("HEAD"), method = "centerX()D", cancellable = true)
    private void centerX_1944088854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944088854L))
            info.setReturnValue(4.92681900516652E8D);
    }

    @Inject(at = @At("HEAD"), method = "centerZ()D", cancellable = true)
    private void centerZ_2001347156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001347156L))
            info.setReturnValue(4.9268190094470805E8D);
    }

    @Inject(at = @At("HEAD"), method = "warningBlocks()I", cancellable = true)
    private void warningBlocks_1965861276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965861276L))
            info.setReturnValue(-496479348);
    }

    @Inject(at = @At("HEAD"), method = "warningTime()I", cancellable = true)
    private void warningTime_1287338421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287338421L))
            info.setReturnValue(-1651529646);
    }

    @Inject(at = @At("HEAD"), method = "lerpTarget()D", cancellable = true)
    private void lerpTarget__273307407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273307407L))
            info.setReturnValue(4.9268190024769586E8D);
    }

    @Inject(at = @At("HEAD"), method = "safeZone()D", cancellable = true)
    private void safeZone__904439648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904439648L))
            info.setReturnValue(4.926819000541959E8D);
    }


}
