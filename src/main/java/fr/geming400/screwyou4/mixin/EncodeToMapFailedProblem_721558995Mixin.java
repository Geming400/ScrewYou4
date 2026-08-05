package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueOutput.EncodeToMapFailedProblem.class)
public class EncodeToMapFailedProblem_721558995Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1714216083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714216083L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2107071253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107071253L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__413900981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413900981L))
            info.setReturnValue("E;f1?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_759821736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759821736L))
            info.setReturnValue(-1236661216);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error_1173803645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173803645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__413901477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413901477L))
            info.setReturnValue("x!7jb[p!nC`\u663BRQs+G");
    }


}
