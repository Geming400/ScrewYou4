package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentPatch.class)
public class DataComponentPatch_547360237Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_585622482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585622482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentGetter;Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_312378296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312378296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1932871999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932871999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__588100235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588100235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_585622482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585622482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_585638819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585638819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "split()Lnet/minecraft/core/component/DataComponentPatch$SplitResult;", cancellable = true)
    private void split__422951782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422951782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private static void builder__1296172722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296172722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entrySet()Ljava/util/Set;", cancellable = true)
    private void entrySet__1281675250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281675250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forget(Ljava/util/function/Predicate;)Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void forget_868780060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868780060L))
            info.setReturnValue(null);
    }


}
