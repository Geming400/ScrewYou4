package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.MapDecorations.Entry.class)
public class Entry552190363Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/Holder;", cancellable = true)
    private void type__991837411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991837411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__356435905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356435905L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1322613888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322613888L))
            info.setReturnValue("zV2)'O%.:Hdh\u4109cxM{$s$U24\u05F0\u121E_jt$F&9bD*GyQ\u802A;\uB02ANq&$\u4E77^LWQ=(i9ORp\u5ED5DTB7@\uC1CF?<*\"rm\u621A34Y\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1109542454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109542454L))
            info.setReturnValue(-103368672);
    }

    @Inject(at = @At("HEAD"), method = "x()D", cancellable = true)
    private void x__269021372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269021372L))
            info.setReturnValue(2.2227000080223823E8D);
    }

    @Inject(at = @At("HEAD"), method = "z()D", cancellable = true)
    private void z__211763070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211763070L))
            info.setReturnValue(2.2227000004717195E8D);
    }

    @Inject(at = @At("HEAD"), method = "rotation()F", cancellable = true)
    private void rotation_753695616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(753695616L))
            info.setReturnValue(2.2227E8F);
    }


}
