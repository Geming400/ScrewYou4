package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.CardinalLighting.class)
public class CardinalLighting_258201634Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1643713892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643713892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__877258342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877258342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_296464375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296464375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "up()F", cancellable = true)
    private void up_296460996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296460996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "down()F", cancellable = true)
    private void down_296460996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296460996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()F", cancellable = true)
    private void north_296460996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296460996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()F", cancellable = true)
    private void south_296460996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296460996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()F", cancellable = true)
    private void west_296460996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296460996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()F", cancellable = true)
    private void east_296460996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296460996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byFace(Lnet/minecraft/core/Direction;)F", cancellable = true)
    private void byFace__861739824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861739824L))
            info.setReturnValue(null);
    }


}
