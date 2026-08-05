package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.CodepointMap.class)
public class CodepointMap_1828811423Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Ljava/lang/Object;", cancellable = true)
    private void remove__1032115236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1032115236L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/lang/Object;", cancellable = true)
    private void get__519894838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519894838L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "put(ILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void put_164515029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164515029L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1042983716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1042983716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeIfAbsent(ILjava/util/function/IntFunction;)Ljava/lang/Object;", cancellable = true)
    private void computeIfAbsent__1442089356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442089356L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/client/gui/font/CodepointMap$Output;)V", cancellable = true)
    private void forEach__389431550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-389431550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keySet()Lit/unimi/dsi/fastutil/ints/IntSet;", cancellable = true)
    private void keySet__2014366634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2014366634L))
            info.setReturnValue(null);
    }


}
