package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StaticCache2D.class)
public class StaticCache2D_1413191080Mixin {
        @Inject(at = @At("HEAD"), method = "get(II)Ljava/lang/Object;", cancellable = true)
    private void get__1565741022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565741022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_277730608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277730608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(II)Z", cancellable = true)
    private void contains_417315454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417315454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_2094207492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2094207492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(IIILnet/minecraft/util/StaticCache2D$Initializer;)Lnet/minecraft/util/StaticCache2D;", cancellable = true)
    private static void create__1055188989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055188989L))
            info.setReturnValue(null);
    }


}
