package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.LocalCoordinates.class)
public class LocalCoordinates1553604656Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_644978388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644978388L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1970939115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1970939115L))
            info.setReturnValue("S[_2w\u2D4AAb0\u3F63}21/o|pfv\u6EEDt\u9139)O_,?l\".F`rnf*_G.oNI'&>]\u2778CcIhH=D'Fk3q&\u8B4ER-<{ps3z\u264766J[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2110956747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110956747L))
            info.setReturnValue(178863071);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/LocalCoordinates;", cancellable = true)
    private static void parse__104279015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104279015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()D", cancellable = true)
    private void left__1052430422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052430422L))
            info.setReturnValue(7.922494000794313E8D);
    }

    @Inject(at = @At("HEAD"), method = "up()D", cancellable = true)
    private void up_1262075286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262075286L))
            info.setReturnValue(7.922494009740287E8D);
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosition__1536177334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536177334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void getRotation_1003646080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003646080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forwards()D", cancellable = true)
    private void forwards_2004409795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004409795L))
            info.setReturnValue(7.92249400138951E8D);
    }

    @Inject(at = @At("HEAD"), method = "isZRelative()Z", cancellable = true)
    private void isZRelative_1366550539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366550539L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isXRelative()Z", cancellable = true)
    private void isXRelative__1917299507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1917299507L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isYRelative()Z", cancellable = true)
    private void isYRelative_1872109164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872109164L))
            info.setReturnValue(false);
    }


}
