package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.MemoryAccessor.class)
public class MemoryAccessor_979779144Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lcom/mojang/datafixers/kinds/App;", cancellable = true)
    private void value_583048814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583048814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;)V", cancellable = true)
    private void set__1184964620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1184964620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "erase()V", cancellable = true)
    private void erase_1882810900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1882810900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOrErase(Ljava/util/Optional;)V", cancellable = true)
    private void setOrErase_1364883336(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1364883336L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWithExpiry(Ljava/lang/Object;J)V", cancellable = true)
    private void setWithExpiry__692789901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-692789901L))
            info.cancel();
    }


}
