package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapDecoration.class)
public class MapDecoration512780302Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name_758241724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(758241724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/Holder;", cancellable = true)
    private void type_2061656074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061656074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1898292561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898292561L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__622679673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-622679673L))
            info.setReturnValue("0Y(0Ph0Qn;솿?<#cH[뭦M h(1剌Qテ@_}fm1=JS%n⡑a;3mJሔI,ip/i牆g繠 eL쌊q@0HE2tn3䌚v7\"{밉>3P({u[>緤袍nZ8@JT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_551043044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551043044L))
            info.setReturnValue(-369413059);
    }

    @Inject(at = @At("HEAD"), method = "x()B", cancellable = true)
    private void x_551035821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551035821L))
            info.setReturnValue(115);
    }

    @Inject(at = @At("HEAD"), method = "y()B", cancellable = true)
    private void y_551035821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551035821L))
            info.setReturnValue(115);
    }

    @Inject(at = @At("HEAD"), method = "getSpriteLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getSpriteLocation__1930286251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930286251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rot()B", cancellable = true)
    private void rot_551035821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551035821L))
            info.setReturnValue(115);
    }

    @Inject(at = @At("HEAD"), method = "renderOnFrame()Z", cancellable = true)
    private void renderOnFrame_551058885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551058885L))
            info.setReturnValue(false);
    }


}
