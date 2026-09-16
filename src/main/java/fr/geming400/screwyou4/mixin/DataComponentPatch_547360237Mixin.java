package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentPatch.class)
public class DataComponentPatch_547360237Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_991091825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991091825L))
            info.setReturnValue(-145356949);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentGetter;Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1670146318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670146318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__361266528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361266528L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1317783265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317783265L))
            info.setReturnValue("!xy$xgs\"R\u40BF..O%+zd\u8390\u86444;R}\u3AA7N\u81F4VK%\u4017:\u09AAGWk$f\u2995KR;Ipy31k3w|g;1d\uFD1Ar");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1104711831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104711831L))
            info.setReturnValue(-1363329317);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1606476608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606476608L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "split()Lnet/minecraft/core/component/DataComponentPatch$SplitResult;", cancellable = true)
    private void split_1167088832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1167088832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private static void builder__673316973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673316973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entrySet()Ljava/util/Set;", cancellable = true)
    private void entrySet__687343746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-687343746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forget(Ljava/util/function/Predicate;)Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void forget_509961487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509961487L))
            info.setReturnValue(null);
    }


}
