package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.FrontAndTop.class)
public class FrontAndTop734574857Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/FrontAndTop;", cancellable = true)
    private static void values__1455828611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455828611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/FrontAndTop;", cancellable = true)
    private static void valueOf__168592390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168592390L))
            info.setReturnValue(net.minecraft.core.FrontAndTop.DOWN_WEST);
    }

    @Inject(at = @At("HEAD"), method = "top()Lnet/minecraft/core/Direction;", cancellable = true)
    private void top__28280428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28280428L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "front()Lnet/minecraft/core/Direction;", cancellable = true)
    private void front__28280428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28280428L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "fromFrontAndTop(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/FrontAndTop;", cancellable = true)
    private static void fromFrontAndTop__915615956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915615956L))
            info.setReturnValue(net.minecraft.core.FrontAndTop.DOWN_SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__400885614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400885614L))
            info.setReturnValue("+h_\u5EED\u2497R^Vwi_XKh(;i:(^8=GFA&O^UV>_'.FUHoIRN\u17B2\uB28C\u9B66_MWs\u9354Zpq^<1h$L_&;>VR\uAF2DSmRgf\uC096).]/XI:p3<7 |\u9D59a");
    }


}
