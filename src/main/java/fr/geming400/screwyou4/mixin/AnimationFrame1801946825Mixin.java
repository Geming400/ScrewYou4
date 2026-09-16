package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.AnimationFrame.class)
public class AnimationFrame1801946825Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index__1798904035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1798904035L))
            info.setReturnValue(-1327930235);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_893320557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893320557L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1722596946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1722596946L))
            info.setReturnValue("5@0WjY f(J\u4026y\u510DKZkm\uB231sP2jb\uFBA5h%]&_t%@):zat8itf\uF9A0j)\u0567BC&l\uCC21>D[\uBF94b<t{mzWH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1935668380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935668380L))
            info.setReturnValue(451290083);
    }

    @Inject(at = @At("HEAD"), method = "time()Ljava/util/Optional;", cancellable = true)
    private void time_194442308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194442308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeOr(I)I", cancellable = true)
    private void timeOr_1633070776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633070776L))
            info.setReturnValue(-444890116);
    }


}
