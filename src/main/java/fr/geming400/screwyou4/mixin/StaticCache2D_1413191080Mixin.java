package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StaticCache2D.class)
public class StaticCache2D_1413191080Mixin {
        @Inject(at = @At("HEAD"), method = "get(II)Ljava/lang/Object;", cancellable = true)
    private void get_1391140216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391140216L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2111353188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111353188L))
            info.setReturnValue("\uC56F3NM ,u5*'R5");
    }

    @Inject(at = @At("HEAD"), method = "contains(II)Z", cancellable = true)
    private void contains__1123683457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123683457L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_929680878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(929680878L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(IIILnet/minecraft/util/StaticCache2D$Initializer;)Lnet/minecraft/util/StaticCache2D;", cancellable = true)
    private static void create__133432441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133432441L))
            info.setReturnValue(null);
    }


}
