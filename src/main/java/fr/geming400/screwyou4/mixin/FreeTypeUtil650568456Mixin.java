package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.FreeTypeUtil.class)
public class FreeTypeUtil650568456Mixin {
        @Inject(at = @At("HEAD"), method = "x(Lorg/lwjgl/util/freetype/FT_Vector;)F", cancellable = true)
    private static void x__690058064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690058064L))
            info.setReturnValue(5.348444E8F);
    }

    @Inject(at = @At("HEAD"), method = "destroy()V", cancellable = true)
    private static void destroy__717080839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-717080839L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkError(ILjava/lang/String;)Z", cancellable = true)
    private static void checkError__927601702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927601702L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "assertError(ILjava/lang/String;)V", cancellable = true)
    private static void assertError_986554200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(986554200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVector(Lorg/lwjgl/util/freetype/FT_Vector;FF)Lorg/lwjgl/util/freetype/FT_Vector;", cancellable = true)
    private static void setVector_967340764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967340764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLibrary()J", cancellable = true)
    private static void getLibrary_514451522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(514451522L))
            info.setReturnValue(-7633111565511781218L);
    }


}
