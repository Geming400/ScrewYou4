package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.HitboxRenderState.class)
public class HitboxRenderState1720520901Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_811894633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811894633L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1804022870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804022870L))
            info.setReturnValue("*f)cd0yCX\u29DFN\u2F3AGE[#%X|<!JY>rx=TttV6\u0504!'/\u92C7h\"'\uB3E5kWsf= hm,\u942As^QVRx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2017094304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017094304L))
            info.setReturnValue(1556410147);
    }

    @Inject(at = @At("HEAD"), method = "x1()D", cancellable = true)
    private void x1__2007101235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007101235L))
            info.setReturnValue(2.656433008416414E8D);
    }

    @Inject(at = @At("HEAD"), method = "y1()D", cancellable = true)
    private void y1__1119597554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119597554L))
            info.setReturnValue(2.6564330041534263E8D);
    }

    @Inject(at = @At("HEAD"), method = "z1()D", cancellable = true)
    private void z1__232093873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232093873L))
            info.setReturnValue(2.6564330096298712E8D);
    }

    @Inject(at = @At("HEAD"), method = "z0()D", cancellable = true)
    private void z0__260723024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-260723024L))
            info.setReturnValue(2.6564330007109645E8D);
    }

    @Inject(at = @At("HEAD"), method = "red()F", cancellable = true)
    private void red_882169207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882169207L))
            info.setReturnValue(2.656433E8F);
    }

    @Inject(at = @At("HEAD"), method = "x0()D", cancellable = true)
    private void x0__2035730386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035730386L))
            info.setReturnValue(2.6564330021625298E8D);
    }

    @Inject(at = @At("HEAD"), method = "y0()D", cancellable = true)
    private void y0__1148226705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148226705L))
            info.setReturnValue(2.6564330069048673E8D);
    }

    @Inject(at = @At("HEAD"), method = "blue()F", cancellable = true)
    private void blue__677850290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677850290L))
            info.setReturnValue(2.656433E8F);
    }

    @Inject(at = @At("HEAD"), method = "green()F", cancellable = true)
    private void green_1329329733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329329733L))
            info.setReturnValue(2.656433E8F);
    }

    @Inject(at = @At("HEAD"), method = "offsetZ()F", cancellable = true)
    private void offsetZ__1883673183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883673183L))
            info.setReturnValue(2.656433E8F);
    }

    @Inject(at = @At("HEAD"), method = "offsetY()F", cancellable = true)
    private void offsetY__1912302334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912302334L))
            info.setReturnValue(2.656433E8F);
    }

    @Inject(at = @At("HEAD"), method = "offsetX()F", cancellable = true)
    private void offsetX__1940931485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940931485L))
            info.setReturnValue(2.656433E8F);
    }


}
