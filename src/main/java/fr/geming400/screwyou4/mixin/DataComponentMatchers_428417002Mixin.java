package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DataComponentMatchers.class)
public class DataComponentMatchers_428417002Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1813929260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813929260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__707042974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707042974L))
            info.setReturnValue("KIM613^Y)Kq*(E桙drhw6%.Z頏d`xA,H篏p>d''u#|n4KX $體I?2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_466679743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466679743L))
            info.setReturnValue(2099037898);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void test__2032899073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032899073L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1814057724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814057724L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_466695584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466695584L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "exact()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void exact__1156292742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156292742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "partial()Ljava/util/Map;", cancellable = true)
    private void partial__1576206639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576206639L))
            info.setReturnValue(null);
    }


}
