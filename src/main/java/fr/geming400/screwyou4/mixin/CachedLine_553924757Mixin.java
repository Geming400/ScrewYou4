package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.CachedLine.class)
public class CachedLine_553924757Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__354701512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-354701512L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1324348281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324348281L))
            info.setReturnValue("o+<E\u1AC3&jFaPqX\uBDF0#@aFfYm{Ma75\uFF9Aj\u37E8,\u58B8\u21C5Myn}o\uD223\u5DBEH59\uD0D1r");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1111276847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111276847L))
            info.setReturnValue(1328619308);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1086223244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1086223244L))
            info.setReturnValue(-1407013676);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void contents_505218338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505218338L))
            info.setReturnValue(null);
    }


}
