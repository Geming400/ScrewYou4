package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.LocalCoordinates.class)
public class LocalCoordinates1553604656Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1355850381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355850381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_418144681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418144681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1591867398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591867398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/LocalCoordinates;", cancellable = true)
    private static void parse__1383829594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383829594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()D", cancellable = true)
    private void left_1591862097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591862097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "up()D", cancellable = true)
    private void up_1591862097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591862097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosition__377688341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377688341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void getRotation__377718132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377718132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forwards()D", cancellable = true)
    private void forwards_1591862097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591862097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isXRelative()Z", cancellable = true)
    private void isXRelative_1591883239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591883239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isYRelative()Z", cancellable = true)
    private void isYRelative_1591883239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591883239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isZRelative()Z", cancellable = true)
    private void isZRelative_1591883239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591883239L))
            info.setReturnValue(null);
    }


}
