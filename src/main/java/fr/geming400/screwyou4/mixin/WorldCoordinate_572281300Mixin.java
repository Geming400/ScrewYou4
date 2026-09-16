package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.WorldCoordinate.class)
public class WorldCoordinate_572281300Mixin {
        @Inject(at = @At("HEAD"), method = "get(D)D", cancellable = true)
    private void get_98743998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98743998L))
            info.setReturnValue(4.9563590020589626E8D);
    }

    @Inject(at = @At("HEAD"), method = "value()D", cancellable = true)
    private void value__1732394461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732394461L))
            info.setReturnValue(4.9563590074432296E8D);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__336344969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-336344969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1342704824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342704824L))
            info.setReturnValue("|v\"$\u50B0{\uB2DDd_/xX|(Ljpf`o>I*m]b%\u14CA!k=7epUOh_N]-)\u793F\u106F+jx`a%DHBXN0)q|fET*eJ-i?a\"@s>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1129633390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129633390L))
            info.setReturnValue(991972623);
    }

    @Inject(at = @At("HEAD"), method = "parseInt(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private static void parseInt__758529943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758529943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRelative(Lcom/mojang/brigadier/StringReader;)Z", cancellable = true)
    private static void isRelative_722556322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722556322L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isRelative()Z", cancellable = true)
    private void isRelative_507028276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507028276L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "parseDouble(Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private static void parseDouble__1632354029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632354029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative()Z", cancellable = true)
    private void relative__1661383618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661383618L))
            info.setReturnValue(true);
    }


}
