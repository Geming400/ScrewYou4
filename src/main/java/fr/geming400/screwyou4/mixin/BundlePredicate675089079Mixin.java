package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.BundlePredicate.class)
public class BundlePredicate675089079Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__233537189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233537189L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1445512604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445512604L))
            info.setReturnValue("\u3BC4\uA837B^S0\"YYAh4_0wd< EA2{m-U\uBAF9@(=u\uB408W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1232441170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232441170L))
            info.setReturnValue(400255276);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1903363683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903363683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__793048265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793048265L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/BundleContents;)Z", cancellable = true)
    private void matches_1837171295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837171295L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/Optional;", cancellable = true)
    private void items_261170213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261170213L))
            info.setReturnValue(null);
    }


}
