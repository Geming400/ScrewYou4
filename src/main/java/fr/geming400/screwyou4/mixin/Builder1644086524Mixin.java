package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentExactPredicate.Builder.class)
public class Builder1644086524Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void build_59376781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59376781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expect(Lnet/minecraft/core/component/TypedDataComponent;)Lnet/minecraft/core/component/DataComponentExactPredicate$Builder;", cancellable = true)
    private void expect_461082614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461082614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expect(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/DataComponentExactPredicate$Builder;", cancellable = true)
    private void expect_1183020778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183020778L))
            info.setReturnValue(null);
    }


}
