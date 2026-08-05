package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugGameEventInfo.class)
public class DebugGameEventInfo1968296143Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__941158894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941158894L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_832836168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832836168L))
            info.setReturnValue("`s\u3B86X\u1D8D9:AvBA\u9750<-y+w=z#G\"n|I`n0MrK/_c|gViF;C3bL@6K#kE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2006558885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006558885L))
            info.setReturnValue(-1618651734);
    }

    @Inject(at = @At("HEAD"), method = "event()Lnet/minecraft/core/Holder;", cancellable = true)
    private void event__777795381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777795381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos__1228941624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228941624L))
            info.setReturnValue(null);
    }


}
