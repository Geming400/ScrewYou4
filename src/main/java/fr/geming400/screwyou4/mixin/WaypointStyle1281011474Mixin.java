package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.WaypointStyle.class)
public class WaypointStyle1281011474Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1628443563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628443563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_145551499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145551499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1319274216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1319274216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate()Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void validate__463494399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463494399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spriteLocations()Ljava/util/List;", cancellable = true)
    private void spriteLocations__1387619006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1387619006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "farDistance()I", cancellable = true)
    private void farDistance_1319273720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1319273720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nearDistance()I", cancellable = true)
    private void nearDistance_1319273720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1319273720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprite(F)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sprite__381328221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381328221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprites()Ljava/util/List;", cancellable = true)
    private void sprites__1387619006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1387619006L))
            info.setReturnValue(null);
    }


}
