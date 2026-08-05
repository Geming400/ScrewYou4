package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.CodepointMap.class)
public class CodepointMap_1828811423Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Ljava/lang/Object;", cancellable = true)
    private void remove__892372768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892372768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/lang/Object;", cancellable = true)
    private void get__892372768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892372768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(ILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void put__1583578364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583578364L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1867086161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1867086161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeIfAbsent(ILjava/util/function/IntFunction;)Ljava/lang/Object;", cancellable = true)
    private void computeIfAbsent__1289823967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1289823967L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/client/gui/font/CodepointMap$Output;)V", cancellable = true)
    private void forEach__697618792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-697618792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keySet()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void keySet_1224255289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224255289L))
            info.setReturnValue(null);
    }


}
