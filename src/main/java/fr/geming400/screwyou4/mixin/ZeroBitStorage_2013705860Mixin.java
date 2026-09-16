package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ZeroBitStorage.class)
public class ZeroBitStorage_2013705860Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)I", cancellable = true)
    private void get_1544790968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544790968L))
            info.setReturnValue(-1432004962);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/util/BitStorage;", cancellable = true)
    private void copy_285203531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285203531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(II)V", cancellable = true)
    private void set__1968128588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1968128588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize__1847134638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847134638L))
            info.setReturnValue(-21074231);
    }

    @Inject(at = @At("HEAD"), method = "getAndSet(II)I", cancellable = true)
    private void getAndSet__1775075736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775075736L))
            info.setReturnValue(1035574987);
    }

    @Inject(at = @At("HEAD"), method = "getAll(Ljava/util/function/IntConsumer;)V", cancellable = true)
    private void getAll__1222708756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1222708756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBits()I", cancellable = true)
    private void getBits__1814426515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814426515L))
            info.setReturnValue(1947012977);
    }

    @Inject(at = @At("HEAD"), method = "unpack([I)V", cancellable = true)
    private void unpack_554684178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(554684178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRaw()[J", cancellable = true)
    private void getRaw__1208768893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208768893L))
            info.setReturnValue(null);
    }


}
