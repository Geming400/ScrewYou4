package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentExactPredicate.Builder.class)
public class Builder1644086524Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void build_64626299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64626299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expect(Lnet/minecraft/core/component/TypedDataComponent;)Lnet/minecraft/core/component/DataComponentExactPredicate$Builder;", cancellable = true)
    private void expect__2030290051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2030290051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/DataComponentExactPredicate$Builder;", cancellable = true)
    private void expect_1711041091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711041091L))
            info.setReturnValue(null);
    }


}
