package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AmbientMoodSettings.class)
public class AmbientMoodSettings21112468Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__887513800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887513800L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_791535993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791535993L))
            info.setReturnValue("qO0?w;|\u5552\uC8F9&\u4306!WToR7E%eG@|=\uABEDVM\u6853MhF)5L5*]^zw(6}1l5!\"\u6EE7LAda");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_578464559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578464559L))
            info.setReturnValue(634466316);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent_1326217829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326217829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickDelay()I", cancellable = true)
    private void tickDelay_1950894676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950894676L))
            info.setReturnValue(-1568935120);
    }

    @Inject(at = @At("HEAD"), method = "soundPositionOffset()D", cancellable = true)
    private void soundPositionOffset__1006484854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006484854L))
            info.setReturnValue(2.430827006921877E8D);
    }

    @Inject(at = @At("HEAD"), method = "blockSearchExtent()I", cancellable = true)
    private void blockSearchExtent_1735612347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735612347L))
            info.setReturnValue(1246768600);
    }


}
