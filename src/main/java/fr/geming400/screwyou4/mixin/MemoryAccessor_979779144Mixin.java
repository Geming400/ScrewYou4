package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.MemoryAccessor.class)
public class MemoryAccessor_979779144Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void value_1841261887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1841261887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;)V", cancellable = true)
    private void set__1929680234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929680234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "erase()V", cancellable = true)
    private void erase_1018053882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1018053882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWithExpiry(Ljava/lang/Object;J)V", cancellable = true)
    private void setWithExpiry_1009175256(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1009175256L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOrErase(Ljava/util/Optional;)V", cancellable = true)
    private void setOrErase_1454096425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1454096425L))
            info.cancel();
    }


}
