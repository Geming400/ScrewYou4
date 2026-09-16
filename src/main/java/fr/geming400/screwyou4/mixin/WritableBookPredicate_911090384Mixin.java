package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.WritableBookPredicate.class)
public class WritableBookPredicate_911090384Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2464115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2464115L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1681513908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681513908L))
            info.setReturnValue("8\u4352<|`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1468442474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468442474L))
            info.setReturnValue(1246442401);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1667362379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667362379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__557046961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557046961L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/WritableBookContent;)Z", cancellable = true)
    private void matches_1299606575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299606575L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/Optional;", cancellable = true)
    private void pages__1020954559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020954559L))
            info.setReturnValue(null);
    }


}
