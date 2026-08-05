package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.WorldCoordinates.class)
public class WorldCoordinates_739632279Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__168993990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168993990L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1510055803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510055803L))
            info.setReturnValue("2<5W@NB\uD5EBS\uA127hx\u8A560PnbY|&\u4880>aw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1296984369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296984369L))
            info.setReturnValue(483727307);
    }

    @Inject(at = @At("HEAD"), method = "x()Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private void x__401932238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401932238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseInt(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinates;", cancellable = true)
    private static void parseInt__1859987665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859987665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private void z__1618085964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618085964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private void y__1010009101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010009101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseDouble(Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinates;", cancellable = true)
    private static void parseDouble_1116236741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116236741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolute(Lnet/minecraft/world/phys/Vec2;)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinates;", cancellable = true)
    private static void absolute__673498931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673498931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolute(DDD)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinates;", cancellable = true)
    private static void absolute__637008364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637008364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosition_1944817584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944817584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void getRotation_189673702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189673702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isYRelative()Z", cancellable = true)
    private void isYRelative_1058136786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1058136786L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isZRelative()Z", cancellable = true)
    private void isZRelative_552578161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552578161L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isXRelative()Z", cancellable = true)
    private void isXRelative_1563695411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563695411L))
            info.setReturnValue(true);
    }


}
