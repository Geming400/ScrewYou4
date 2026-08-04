package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.WorldCoordinate.class)
public class WorldCoordinate_572281300Mixin {
        @Inject(at = @At("HEAD"), method = "get(D)D", cancellable = true)
    private void get_1781563368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781563368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()D", cancellable = true)
    private void value_610538740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610538740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1957793558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957793558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__563178676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563178676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_610544041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610544041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseInt(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private static void parseInt__153170139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153170139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRelative(Lcom/mojang/brigadier/StringReader;)Z", cancellable = true)
    private static void isRelative_1366032780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366032780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRelative()Z", cancellable = true)
    private void isRelative_610559882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610559882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseDouble(Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private static void parseDouble_1129339823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129339823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative()Z", cancellable = true)
    private void relative_610559882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610559882L))
            info.setReturnValue(null);
    }


}
