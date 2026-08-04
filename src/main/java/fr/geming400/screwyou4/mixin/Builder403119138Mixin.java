package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentPatch.Builder.class)
public class Builder403119138Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private void remove__1531314724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531314724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Iterable;)Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private void set__117945899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-117945899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/TypedDataComponent;)Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private void set_650753260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650753260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private void set__1575457928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1575457928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void build__1322055485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322055485L))
            info.setReturnValue(null);
    }


}
