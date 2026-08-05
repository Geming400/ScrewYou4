package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.FreeTypeUtil.class)
public class FreeTypeUtil650568456Mixin {
        @Inject(at = @At("HEAD"), method = "x(Lorg/lwjgl/util/freetype/FT_Vector;)F", cancellable = true)
    private static void x__339057608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339057608L))
            info.setReturnValue(2.283131E8F);
    }

    @Inject(at = @At("HEAD"), method = "destroy()V", cancellable = true)
    private static void destroy_688843443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(688843443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkError(ILjava/lang/String;)Z", cancellable = true)
    private static void checkError_1545185786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545185786L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLibrary()J", cancellable = true)
    private static void getLibrary_688831911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688831911L))
            info.setReturnValue(-398652059296312473L);
    }

    @Inject(at = @At("HEAD"), method = "setVector(Lorg/lwjgl/util/freetype/FT_Vector;FF)Lorg/lwjgl/util/freetype/FT_Vector;", cancellable = true)
    private static void setVector__940695017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940695017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assertError(ILjava/lang/String;)V", cancellable = true)
    private static void assertError_1545181942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1545181942L))
            info.cancel();
    }


}
